package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.besoccer.Equipos;
import aiss.model.besoccer.Partidos;
import aiss.model.besoccer.Plantillas;
import aiss.model.besoccer.Competicion;

public class BesoccerResource {
	
	private static final String Besoccer_API_KEY = "703ba5f6ee6782abd9933beae2f98ad1";
    private String uri = "https://apiclient.besoccerapps.com/scripts/api/api.php?key=" + Besoccer_API_KEY + "&z=Europe/Madrid&format=json&req=";
    
	public Partidos getJornada(String division, String jornada) throws UnsupportedEncodingException {
		
		ClientResource cr = null;
		Partidos lists = null;
		try {
			cr = new ClientResource(uri + "matchs&league=" + URLEncoder.encode(division, "UTF-8") + "&round=" + URLEncoder.encode(jornada, "UTF-8") + "&year=2020");
			lists = cr.get(Partidos.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving the collections of round: " + cr.getResponse().getStatus());
		}
		
		return lists;
	}

	public Plantillas getJugadoresEquipo(String equipo) throws UnsupportedEncodingException {
		
		ClientResource cr = null;
		Plantillas lists = null;
		try {
			cr = new ClientResource(uri + "team_players&team=" + URLEncoder.encode(equipo, "UTF-8")  + "&year=2020");
			lists = cr.get(Plantillas.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving the collections of players: " + cr.getResponse().getStatus());
		}
		
		return lists;
	}
	
	public Equipos getListadoEquipos(String numeroLiga) throws UnsupportedEncodingException{
		
		ClientResource cr = null;
		Equipos listaEquipos = null;
		try {
			cr = new ClientResource(uri + "teams&year=2020&league=" + URLEncoder.encode(numeroLiga, "UTF-8"));
			listaEquipos = cr.get(Equipos.class);
		}catch (ResourceException re) {
			System.err.println("Error con listado equipos: " + cr.getResponse().getStatus());
			throw re;
		}
		
		return listaEquipos;
	}
	
	public Competicion getClasificacion(String numeroLiga) throws UnsupportedEncodingException{
		
		ClientResource cr = null;
		Competicion clasificacion = null;
		try {
			cr = new ClientResource(uri + "tables&group=1&league=" + URLEncoder.encode(numeroLiga, "UTF-8"));
			clasificacion = cr.get(Competicion.class);
		}catch (ResourceException re) {
			System.err.println("Error con listado equipos: " + cr.getResponse().getStatus());
			throw re;
		}
		
		return clasificacion;
	}

}
