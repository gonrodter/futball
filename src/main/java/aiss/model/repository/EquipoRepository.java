package aiss.model.repository;

import java.util.Collection;

import aiss.model.api.Equipo;
import aiss.model.api.Jugador;

public interface EquipoRepository {

	//Equipos
	public void addEquipo(Equipo p);
	public Collection<Equipo> getAllEquipos();
	public Equipo getEquipo(String id);
	public void updateEquipo(Equipo p);
	public void deleteEquipo(String id);
	public void addJugadorTraspaso(String equipoOrigenId, String equipoDestinoId, String jugadorId);
	public void addJugador(String equipoId, String jugadorId);
	public Collection<Jugador> getAll(String equipoId);
	public void removeJugador(String equipoId, String jugadorId);
	public String getNombreEquipo(String id);
	
	//Jugadores
	public void addJugador(Jugador s);
	public Collection<Jugador> getAllJugadores();
	public Jugador getJugador(String jugadorId);
	public void updateJugador(Jugador s);
	public void deleteJugador(String jugadorId);
	
	
	
	
	
	

}
