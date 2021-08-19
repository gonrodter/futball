package aiss.model.resources;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import aiss.model.sportsdb.*;

public class SportDBTest {

	@Test
	public void getEquiposTest() throws UnsupportedEncodingException {
		String liga = "Spanish La Liga";
		SportDBResource equipos = new SportDBResource();
		EquiposSportsDB SportDBResults = equipos.getListadoEquipos(liga);
		
		assertNotNull("The search returned null", SportDBResults);
		assertNotNull("The search returned null", SportDBResults.getTeams());
		
		
		System.out.println("The search for the teams in " + liga + " returned " + SportDBResults.getTeams().get(0).getStrTeam());
		
		// Optional: Print movies data
	
	}
}
