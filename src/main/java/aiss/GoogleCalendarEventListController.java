package aiss;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.GoogleCalendarEventListController;
import aiss.model.gcalendar.Calendario;
import aiss.model.gcalendar.Event;
import aiss.model.resources.CalendarResource;

public class GoogleCalendarEventListController extends HttpServlet {
	 private static final Logger log = Logger.getLogger(GoogleCalendarEventListController.class.getName());

	    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

	        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");

	        if (accessToken != null && !"".equals(accessToken)) {

	            CalendarResource gcResource = new CalendarResource(accessToken);
	            Event events = gcResource.getEvents("primary");

	            if (events != null) {
	                req.setAttribute("evento", events);
	                req.getRequestDispatcher("googleCalendarEventListing.jsp").forward(req, resp);
	            } else {
	                log.info("The events returned are null... probably your token has experied. Redirecting to OAuth servlet.");
	                req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
	            }
	        } else {
	            log.info("Trying to access Google Calendar without an access token, redirecting to OAuth servlet");
	            req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
	        }

	    }

	    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        doGet(req, resp);
	    }

}
