package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.besoccer.Equipos;
import aiss.model.besoccer.Partidos;
import aiss.model.besoccer.Plantillas;
import aiss.model.noticias.Noticia;
import aiss.model.besoccer.Competicion;

public class NoticiasResource {
	

    private String uri = "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Ffutbol.as.com%2Frss%2Ffutbol%2Fprimera.xml";
    
	public Noticia getNoticias() throws UnsupportedEncodingException {
		
		ClientResource cr = null;
		Noticia lists = null;
		try {
			cr = new ClientResource(uri);
			lists = cr.get(Noticia.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving the collections of round: " + cr.getResponse().getStatus());
		}
		
		return lists;
	}
}
