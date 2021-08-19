package aiss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.besoccer.Equipos;
import aiss.model.besoccer.Plantillas;
import aiss.model.noticias.Item;
import aiss.model.noticias.Noticia;
import aiss.model.resources.BesoccerResource;
import aiss.model.resources.NoticiasResource;
import aiss.model.resources.SportDBResource;
import aiss.model.sportsdb.EquiposSportsDB;
import aiss.model.sportsdb.TeamDetails;


/**
 * Servlet implementation class SearchController
 */
public class NoticiasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticiasController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		RequestDispatcher rd = null;
		NoticiasResource recursoNoticias = new NoticiasResource();
		Noticia noticias = recursoNoticias.getNoticias();
		


		if (noticias != null){
			rd = request.getRequestDispatcher("/noticiasView.jsp");
			request.setAttribute("Noticias", noticias.getItems());
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
