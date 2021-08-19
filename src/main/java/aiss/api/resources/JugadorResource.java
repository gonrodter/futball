package aiss.api.resources;

import java.net.URI;
import java.util.Collection;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.api.Jugador;
import aiss.model.repository.EquipoRepository;
import aiss.model.repository.MapEquipoRepository;
import javassist.NotFoundException;

@Path("/jugadores")
public class JugadorResource {

	public static JugadorResource _instance=null;
	EquipoRepository repository;
	
	private JugadorResource(){
		repository=MapEquipoRepository.getInstance();
	}
	
	public static JugadorResource getInstance()
	{
		if(_instance==null)
			_instance=new JugadorResource();
		return _instance; 
	}

@GET
	@Produces("application/json")
	public Collection<Jugador> getAll()
	{
		
		return repository.getAllJugadores();
   		
        }







@GET
	@Path("/{id}")
	@Produces("application/json")
	public Jugador get(@PathParam("id") String jugadorId) throws NotFoundException
	{
		Jugador list = repository.getJugador(jugadorId);
		
		if (list == null) {
			throw new NotFoundException("El jugador con id="+ jugadorId +" no fue encontrado");			
		}
		
		return list;
	}




@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addJugador(@Context UriInfo uriInfo, Jugador j) {
		if (j.getId() == null || "".equals(j.getId()))
			throw new BadRequestException("La ID no puede ser nula");
		
		if (j.getNombre() == null || "".equals(j.getNombre()))
			throw new BadRequestException("El nombre no puede ser nulo");

		if (j.getEdad() == null || "".equals(j.getEdad()))
			throw new BadRequestException("La edad no puede ser nula");
		
		
		if (j.getClub() == null || "".equals(j.getClub()))
			throw new BadRequestException("El club no puede ser nulo");



		repository.addJugador(j);

		// Builds the response. Returns the song the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(j.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(j);			
		return resp.build();
	}

@PUT
@Consumes("application/json")
public Response updateJugador(Jugador jugador) throws NotFoundException {
	Jugador oldjugador = repository.getJugador(jugador.getId());
	if (oldjugador == null) {
		throw new NotFoundException("The player with id="+ jugador.getId() +" was not found");			
	}
	
	// Update name
	if (jugador.getNombre()!=null)
		oldjugador.setNombre(jugador.getNombre());
	
	// Update edad
	if (jugador.getEdad()!=null)
		oldjugador.setEdad(jugador.getEdad());
	
	// Update club
	if (jugador.getClub()!=null)
		oldjugador.setClub(jugador.getClub());
	
	
	
	return Response.noContent().build();
}

	
@DELETE
	@Path("/{id}")
	public Response removeJugador(@PathParam("id") String jugadorId) throws NotFoundException {
		Jugador toberemoved=repository.getJugador(jugadorId);
		if (toberemoved == null)
			throw new NotFoundException("The player with id="+ jugadorId +" was not found");
		else
			repository.deleteJugador(jugadorId);

		return Response.noContent().build();
	}

}



