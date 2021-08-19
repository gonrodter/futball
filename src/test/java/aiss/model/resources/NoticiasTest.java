package aiss.model.resources;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.noticias.Noticia;

public class NoticiasTest {

    @Test
    public void getNoticiasTest() throws UnsupportedEncodingException {
        String equipo = "Real Madrid";
        NoticiasResource Noticia = new NoticiasResource();
        Noticia NoticiasResults = Noticia.getNoticias();

        assertNotNull("The search returned null", NoticiasResults);
        assertNotNull("The search returned null", NoticiasResults.getItems());

        Integer i = 0;
        Integer i2 = 0;
        while (i<NoticiasResults.getItems().size()) {
        	while(i2<NoticiasResults.getItems().get(i).getCategories().size()) {
        		if (NoticiasResults.getItems().get(i).getCategories().get(i2).equals(equipo)) {
        			System.out.println("The search for the notice in " + equipo + " returned " + NoticiasResults.getItems().get(i).getDescription());
        			}
        			i2++;
        		}
        	i++;
        }
       
    }
}