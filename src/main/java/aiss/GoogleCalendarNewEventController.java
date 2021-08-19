package aiss;


import aiss.model.gcalendar.End;
import aiss.model.gcalendar.Event;
import aiss.model.gcalendar.Start;
import aiss.model.resources.CalendarResource;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleCalendarNewEventController extends HttpServlet {

    private static final Logger log = Logger.getLogger(GoogleCalendarNewEventController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
        String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String fecha_start = req.getParameter("start");
        String fecha_end = req.getParameter("end");
        Start start = new Start(fecha_start);
        End end = new End(fecha_end);

        if (accessToken != null && !"".equals(accessToken)) {
            if (title != null && !"".equals(title)) {
                CalendarResource gcResource = new CalendarResource(accessToken);
                Event event = gcResource.addEvent("primary", new Event(title, description, start, end));
                req.setAttribute("message", "Event '" + title + "' added to your Calendar!");
                req.getRequestDispatcher("/GoogleCalendarEventList").forward(req, resp);
                req.setAttribute("evento", event);
            } else {
                req.setAttribute("message", "You must provide a valid title for file");
                req.setAttribute("description", description);
                req.getRequestDispatcher("googleCalendarNewEvent.jsp").forward(req, resp);
            }
        } else {
            log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
        }
    }
    

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
