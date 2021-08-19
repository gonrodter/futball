package aiss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aiss.model.besoccer.Partidos;
import aiss.model.resources.BesoccerResource;


/**
 * Servlet implementation class SearchController
 */
public class PartidosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartidosController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query = request.getParameter("division");
		String query2 = request.getParameter("jornada");
		

		RequestDispatcher rd = null;
		
		BesoccerResource recurso = new BesoccerResource();
		Partidos result = recurso.getJornada(query, query2);
	
		if (result!=null){
			rd = request.getRequestDispatcher("/partidosView.jsp");
			request.setAttribute("jornada", result.getMatch());
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}

