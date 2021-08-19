package aiss.model.resources;

import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import aiss.model.resources.BesoccerResource;
import aiss.model.besoccer.Competicion;
import aiss.model.besoccer.Equipos;
import aiss.model.besoccer.Partidos;
import aiss.model.besoccer.Plantillas;

public class BesoccerTest {

	@Test
	public void getJugadoresEquipoTest() throws UnsupportedEncodingException {
		String equipo = "6279963";
		BesoccerResource a = new BesoccerResource();
		Plantillas BesoccerResult = a.getJugadoresEquipo(equipo);
		
		assertNotNull("The search returned null", BesoccerResult);
		assertNotNull("The search returned null", BesoccerResult.getPlayer());
		
		System.out.println("The search for the players in " + equipo + " returned " + BesoccerResult.getPlayer().get(0).getAlias());
	}
	
	@Test
	public void getClasificacionTest() throws UnsupportedEncodingException {
		String numeroLiga = "1";
		BesoccerResource a = new BesoccerResource();
		Competicion BesoccerResult = a.getClasificacion(numeroLiga);
		
		assertNotNull("The search returned null", BesoccerResult);
		assertNotNull("The search returned null", BesoccerResult.getTable());
		
		System.out.println("The search for the ranking in " + numeroLiga + " returned " + BesoccerResult.getTable().get(0).getBasealias());
	}
	
	@Test
	public void getListadoEquiposTest() throws UnsupportedEncodingException {
		String numeroLiga = "1";
		BesoccerResource a = new BesoccerResource();
		Equipos BesoccerResult = a.getListadoEquipos(numeroLiga);
		
		assertNotNull("The search returned null", BesoccerResult);
		assertNotNull("The search returned null", BesoccerResult.getTeam());
		
		System.out.println("The search for the team in " + numeroLiga + " returned " + BesoccerResult.getTeam().get(0).getBasealias());
	}
	
	@Test
	public void getJornada() throws UnsupportedEncodingException {
		String division = "1";
		String jornada = "1";
		BesoccerResource a = new BesoccerResource();
		Partidos BesoccerResult = a.getJornada(division, jornada);
		
		assertNotNull("The search returned null", BesoccerResult);
		assertNotNull("The search returned null", BesoccerResult.getMatch());
		
		System.out.println("The search for the match in " + division + " returned " + BesoccerResult.getMatch().get(0).getResult());
	}
}

