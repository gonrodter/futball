package aiss;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resources.BesoccerResource;
import aiss.model.besoccer.Competicion;

/**
 * Servlet implementation class SearchController
 */
public class ClasificacionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(ClasificacionController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasificacionController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query =request.getParameter("division");
		RequestDispatcher rd = null;
		
		BesoccerResource recurso = new BesoccerResource();
		Competicion result = recurso.getClasificacion(query);
	
		if (result!=null){
			rd = request.getRequestDispatcher("/clasificacionView.jsp");
			request.setAttribute("clasificacion", result.getTable());
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
