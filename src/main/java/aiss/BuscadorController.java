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
import aiss.model.besoccer.Match;
import aiss.model.besoccer.Plantillas;
import aiss.model.besoccer.Table;
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
public class BuscadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscadorController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	

    	String division1 = "1";
    	String division2 = "Spanish La Liga";
		
		String query=request.getParameter("searchEquipo");
		RequestDispatcher rd = null;
		BesoccerResource recurso = new BesoccerResource();
		Equipos listaEquipos = recurso.getListadoEquipos(division1);
		
		SportDBResource recursoSportsDB = new SportDBResource();
		EquiposSportsDB listaEquiposSportsDB = recursoSportsDB.getListadoEquipos(division2);
		
		NoticiasResource recursoNoticias = new NoticiasResource();
		Noticia noticias = recursoNoticias.getNoticias();
		
		String idEquipo = "0";
		String idEquipoSportsDB = "0";
		
		List<Match> listaPartidos = new ArrayList<>();
		List<Item> listaNoticias = new ArrayList<>();
		List<Table> listaClasificacion = new ArrayList<>();
		//String idEquipo = "6279963";
		int i = 0;
		int iNoticias = 0;
		int iCategorias = 0;
		int idClasificacion = 0;
		int iPartidos = 0;
		int iPartidosAux = 0;


		while(i<listaEquipos.getTeam().size()) {
			if(i==0 || i==1 || i==2 || i==3 || i==14 || i==19) {
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())){
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i).getIdTeam();
				} 
			}
			else if(i==4 || i==5 || i==6 || i==7 || i==8 || i==9 || i==10){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i+1).getIdTeam();
				} 
			}
			else if(i==11 || i==16){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i+2).getIdTeam();
				} 
			}
			else if(i==12){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i+4).getIdTeam();
				} 
			}
			else if(i==13){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i-9).getIdTeam();
				} 
			}
			else if(i==15){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i-3).getIdTeam();
				} 
			}
			else if(i==17){
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i-2).getIdTeam();
				} 
			}
			else{
				if(query.equals(listaEquipos.getTeam().get(i).getNameShow())) {
					idEquipo = listaEquipos.getTeam().get(i).getIdComp();
					idEquipoSportsDB = listaEquiposSportsDB.getTeams().get(i-1).getIdTeam();
				} 
			}
			i++;
		}

		
		while(iNoticias<noticias.getItems().size()) {
				iCategorias=0;
			while(iCategorias<noticias.getItems().get(iNoticias).getCategories().size()) {
				if(noticias.getItems().get(iNoticias).getCategories().get(iCategorias).equals(query)) {
					listaNoticias.add(noticias.getItems().get(iNoticias));
				}
				iCategorias++;
			}
			iNoticias++;
		}
		
		
		while(idClasificacion<recurso.getClasificacion(division1).getTable().size()) {
			if(recurso.getClasificacion(division1).getTable().get(idClasificacion).getTeam().equals(query)) {
				listaClasificacion.add(recurso.getClasificacion(division1).getTable().get(idClasificacion));
			}
			idClasificacion++;
		}
		
		
		if(listaClasificacion.size() != 0) {
			while(iPartidos<5) {
				String jornada = String.valueOf((Integer.parseInt(listaClasificacion.get(0).getRound()) - iPartidos));   
					iPartidosAux = 0;
					while(iPartidosAux<10) {
							if(recurso.getJornada(division1, jornada).getMatch().get(iPartidosAux).getLocal().equals(query) || recurso.getJornada(division1, jornada).getMatch().get(iPartidosAux).getVisitor().equals(query)) {
								listaPartidos.add(recurso.getJornada(division1, jornada).getMatch().get(iPartidosAux));
							}
							iPartidosAux++;
					}
					iPartidos++;
			}
		}
			
	
		Plantillas resultBesoccerPlantillas = recurso.getJugadoresEquipo(idEquipo);
		TeamDetails resultSportsDB = recursoSportsDB.getEquipo(idEquipoSportsDB);
		

		if (resultBesoccerPlantillas!=null){
			rd = request.getRequestDispatcher("/buscadorView.jsp");
			request.setAttribute("BesoccerPlantillas", resultBesoccerPlantillas.getPlayer());
			request.setAttribute("BesoccerClasificacion", listaClasificacion);
			request.setAttribute("BesoccerPartidos", listaPartidos);
			
			request.setAttribute("SportsDB", resultSportsDB.getTeams());
			
			request.setAttribute("Noticias", listaNoticias);
				
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}