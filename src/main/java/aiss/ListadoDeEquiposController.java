package aiss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aiss.model.besoccer.Equipos;
import aiss.model.resources.BesoccerResource;


/**
 * Servlet implementation class SearchController
 */
public class ListadoDeEquiposController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoDeEquiposController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query =request.getParameter("division");
		RequestDispatcher rd = null;
		
		BesoccerResource recurso = new BesoccerResource();
		Equipos result = recurso.getListadoEquipos(query);
	
		if (result!=null){
			rd = request.getRequestDispatcher("/listadoEquiposView.jsp");
			request.setAttribute("listadoequipos", result.getTeam());
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}

