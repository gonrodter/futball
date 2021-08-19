package aiss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.besoccer.Plantillas;
import aiss.model.resources.BesoccerResource;


/**
 * Servlet implementation class SearchController
 */
public class PlantillaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlantillaController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query =request.getParameter("equipo");
		RequestDispatcher rd = null;
		
		BesoccerResource recurso = new BesoccerResource();
		Plantillas result = recurso.getJugadoresEquipo(query);
	
		if (result!=null){
			rd = request.getRequestDispatcher("/plantillaView.jsp");
			request.setAttribute("plantilla", result.getPlayer());
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
