package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.sportsdb.EquiposSportsDB;
import aiss.model.sportsdb.Player;
import aiss.model.sportsdb.PlayerDetails;
import aiss.model.sportsdb.TeamDetails;;

public class SportDBResource {

	private String uri = "https://www.thesportsdb.com/api/v1/json/1";
	
	
	public EquiposSportsDB getListadoEquipos(String liga) throws UnsupportedEncodingException {
		
		ClientResource cr = null;
		EquiposSportsDB listaEquipos = null;
		try {
			cr = new ClientResource(uri + "/search_all_teams.php?l=" + URLEncoder.encode(liga, "UTF-8")); 
			listaEquipos = cr.get(EquiposSportsDB.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving the teams: " + cr.getResponse().getStatus());
		}
		
		return listaEquipos;

	}
	
	public TeamDetails getEquipo(String idEquipo) throws UnsupportedEncodingException {
		ClientResource cr = null;
		TeamDetails listaEquipos = null;
		try {
			cr = new ClientResource(uri + "/lookupteam.php?id=" + URLEncoder.encode(idEquipo, "UTF-8")); 
			listaEquipos = cr.get(TeamDetails.class);


		} catch (ResourceException re) {
			System.err.println("Error when retrieving the teams: " + cr.getResponse().getStatus());
		}
		
		return listaEquipos;

	}

}
