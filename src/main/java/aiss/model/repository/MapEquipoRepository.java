package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import aiss.model.api.Equipo;
import aiss.model.api.Jugador;


public class MapEquipoRepository implements EquipoRepository {

	Map<String, Equipo> equipoMap;
	Map<String, Jugador> jugadorMap;
	private static MapEquipoRepository instance=null;
	private int index=0;
	private int index2=0;
	
	
	public static MapEquipoRepository getInstance() {
		
		if (instance==null) {
			instance = new MapEquipoRepository();
			instance.init();
		}
		
		return instance;
	}
	public void init() {

        equipoMap = new HashMap<String,Equipo>();
        jugadorMap = new HashMap<String,Jugador>();

        // Create jugadores
        Jugador Ramos=new Jugador();
        Ramos.setNombre("Sergio Ramos");
        Ramos.setEdad("34");
        Ramos.setClub("Real Madrid");
        addJugador(Ramos);

        Jugador Messi=new Jugador();
        Messi.setNombre("Lionel Messi");
        Messi.setEdad("33");
        Messi.setClub("FC Barcelona");
        addJugador(Messi);

        Jugador Ronaldo=new Jugador();
        Ronaldo.setNombre("Cristiano Ronaldo");
        Ronaldo.setEdad("35");
        Ronaldo.setClub("Juventus");
        addJugador(Ronaldo);

        Jugador Mbappé =new Jugador();
        Mbappé.setNombre("Kylian Mbappé");
        Mbappé.setEdad("21");
        Mbappé.setClub("PSG");
        addJugador(Mbappé);

        Jugador Cavani =new Jugador();
        Cavani.setNombre("Edinson Cavani");
        Cavani.setEdad("33");
        Cavani.setClub("PSG");
        addJugador(Cavani);


        // Create equipos
        Equipo Madrid=new Equipo();
        Madrid.setName("Real Madrid");
        addEquipo(Madrid);

        Equipo Barcelona=new Equipo();
        Barcelona.setName("FC Barcelona");
        addEquipo(Barcelona);

        Equipo Juventus=new Equipo();
        Juventus.setName("Juventus");
        addEquipo(Juventus);

        Equipo PSG=new Equipo();
        PSG.setName("PSG");
        addEquipo(PSG);


        // Add jugadores to equipos
        addJugador(Madrid.getId(), Ramos.getId());

        addJugador(Barcelona.getId(), Messi.getId());

        addJugador(Juventus.getId(), Ronaldo.getId());

        addJugador(PSG.getId(), Mbappé.getId());
        addJugador(PSG.getId(), Cavani.getId());


    }
	
	// Equipos related operations
	@Override
	public void addEquipo(Equipo e) {
		String id = "e" + index++;	
		e.setId(id);
		equipoMap.put(id,e);
	}
	
	@Override
	public Collection<Equipo> getAllEquipos() {
			return equipoMap.values();
	}

	@Override
	public Equipo getEquipo(String id) {
		return equipoMap.get(id);
	}
	
	@Override
	public void updateEquipo(Equipo p) {
		equipoMap.put(p.getId(),p);
	}

	@Override
	public void deleteEquipo(String id) {	
		equipoMap.remove(id);
	}
	
	@Override
	public String getNombreEquipo(String id) { 
		Equipo equipo = getEquipo(id);
		return equipo.getName();
	}
	

	@Override
	//esto en el caso de que el jugador no tenga equipo
	public void addJugador(String equipoId, String jugadorId) {
		Equipo equipo = getEquipo(equipoId);
		String club = getNombreEquipo(equipoId);
		Jugador j = getJugador(jugadorId);
		equipo.addJugador(jugadorMap.get(jugadorId));
		j.setClub(club);
	}
	
	@Override
	public void addJugadorTraspaso(String equipoOrigenId, String equipoDestinoId, String jugadorId) {
		Equipo equipoDestino = getEquipo(equipoDestinoId);
		String club = getNombreEquipo(equipoDestinoId);
		Jugador j = getJugador(jugadorId);
		equipoDestino.addJugador(jugadorMap.get(jugadorId));
		j.setClub(club);
		removeJugador(equipoOrigenId, jugadorId);
	}

	@Override
	public Collection<Jugador> getAll(String equipoId) {
		return getEquipo(equipoId).getJugadores();
	}

	@Override
	public void removeJugador(String equipoId, String jugadorId) {
		getEquipo(equipoId).deleteJugador(jugadorId);
	}

	
	//Jugadores related operations
	
	@Override
	public void addJugador(Jugador j) {
		String id = "j" + index2++;
		j.setId(id);
		jugadorMap.put(id, j);
	}
	
	@Override
	public Collection<Jugador> getAllJugadores() {
			return jugadorMap.values();
	}

	@Override
	public Jugador getJugador(String jugadorId) {
		return jugadorMap.get(jugadorId);
	}

	@Override
	public void updateJugador(Jugador s) {
		Jugador jugador = jugadorMap.get(s.getId());
		jugador.setNombre(s.getNombre());
		jugador.setEdad(s.getEdad());
		jugador.setClub(s.getClub());
	}

	@Override
	public void deleteJugador(String jugadorId) {
		jugadorMap.remove(jugadorId);
	}
	
}
