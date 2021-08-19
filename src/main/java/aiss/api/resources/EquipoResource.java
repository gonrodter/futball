package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.api.Equipo;
import aiss.model.api.Jugador;
import aiss.model.repository.EquipoRepository;
import aiss.model.repository.MapEquipoRepository;



@Path("/equipos")
public class EquipoResource {
	
	/* Singleton */
	private static EquipoResource _instance=null;
	EquipoRepository repository;
	
	private EquipoResource() {
		repository=MapEquipoRepository.getInstance();

	}
	
	public static EquipoResource getInstance()
	{
		if(_instance==null)
				_instance=new EquipoResource();
		return _instance;
	}
	
	
    @GET
    @Produces("application/json")
    public Collection<Equipo> getAll()
    {       
    	
        return repository.getAllEquipos();
        		
    }
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Equipo get(@PathParam("id") String id)
	{
		Equipo list = repository.getEquipo(id);
		
		if (list == null) {
			throw new NotFoundException("The playlist wit id="+ id +" was not found");			
		}
		
		return list;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addEquipo(@Context UriInfo uriInfo, Equipo equipo) {
		if (equipo.getName() == null || "".equals(equipo.getName()))
			throw new BadRequestException("The name of the team must not be null");
		
		if (equipo.getJugadores()!=null)
			throw new BadRequestException("The players property is not editable.");

		repository.addEquipo(equipo);

		// Builds the response. Returns the playlist the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(equipo.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(equipo);			
		return resp.build();
	}

	
	@PUT
    @Consumes("application/json")
    public Response updateEquipo(Equipo equipo) {
        Equipo oldequipo = repository.getEquipo(equipo.getId());
        if (oldequipo == null) {
            throw new NotFoundException("The playlist with id="+ equipo.getId() +" was not found");
        }

        if (equipo.getJugadores()!=null)
            throw new BadRequestException("The players property is not editable.");

        // Update name
        if (equipo.getName()!=null)
            oldequipo.setName(equipo.getName());


        return Response.noContent().build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeEquipo(@PathParam("id") String id) {
        Equipo toberemoved=repository.getEquipo(id);
        if (toberemoved == null)
            throw new NotFoundException("The team with id="+ id +" was not found");
        else
            repository.deleteEquipo(id);

        return Response.noContent().build();
    }
	
	@POST	
	@Path("/{equipoDestinoId}/{jugadorId}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addJugador(@Context UriInfo uriInfo,@PathParam("equipoDestinoId") String equipoDestinoId, @PathParam("jugadorId") String jugadorId)
	{				
		
		Equipo equipo = repository.getEquipo(equipoDestinoId);
		Jugador jugador = repository.getJugador(jugadorId);
		
		if (equipo==null)
			throw new NotFoundException("The team with id=" + equipoDestinoId + " was not found");
		
		if (jugador == null)
			throw new NotFoundException("The player with id=" + jugadorId + " was not found");
		
		if (equipo.getJugador(jugadorId)!=null)
			throw new BadRequestException("The player is already included in the team.");
			
		repository.addJugador(equipoDestinoId, jugadorId);		

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(equipoDestinoId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(equipo);			
		return resp.build();
	}
	
	@POST	
	@Path("/{equipoOrigenId}/{equipoDestinoId}/{jugadorId}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addJugadorEquipo(@Context UriInfo uriInfo, @PathParam("equipoOrigenId") String equipoOrigenId,@PathParam("equipoDestinoId") String equipoDestinoId, @PathParam("jugadorId") String jugadorId)
	{				
		
		Equipo equipo = repository.getEquipo(equipoDestinoId);
		Jugador jugador = repository.getJugador(jugadorId);
		
		if (equipo==null)
			throw new NotFoundException("The team with id=" + equipoDestinoId + " was not found");
		
		if (jugador == null)
			throw new NotFoundException("The player with id=" + jugadorId + " was not found");
		
		if (equipo.getJugador(jugadorId)!=null)
			throw new BadRequestException("The player is already included in the team.");
			
		repository.addJugadorTraspaso(equipoOrigenId, equipoDestinoId, jugadorId);		

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(equipoDestinoId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(equipo);			
		return resp.build();
	}
	
	
	@DELETE
	@Path("/{equipoId}/{jugadorId}")
	public Response removeJugador(@PathParam("equipoId") String equipoId, @PathParam("jugadorId") String jugadorId) {
		Equipo equipo = repository.getEquipo(equipoId);
		Jugador jugador = repository.getJugador(jugadorId);
		
		if (equipo==null)
			throw new NotFoundException("The playlist with id=" + equipoId + " was not found");
		
		if (jugador == null)
			throw new NotFoundException("The song with id=" + jugadorId + " was not found");
		
		
		repository.removeJugador(equipoId, jugadorId);		
		
		return Response.noContent().build();
	}
}
