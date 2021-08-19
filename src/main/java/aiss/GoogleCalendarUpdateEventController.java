package aiss;

import aiss.model.gcalendar.End;
import aiss.model.gcalendar.Event;
import aiss.model.gcalendar.Start;
import aiss.model.resources.CalendarResource;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleCalendarUpdateEventController extends HttpServlet {

    private static final Logger log = Logger.getLogger(GoogleCalendarDeleteEventController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !"".equals(id)) {
            String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");
            if (accessToken != null && !"".equals(accessToken)) {

                CalendarResource gcResource = new CalendarResource(accessToken);
                Event event = gcResource.getEvent("primary", id);
                String title = req.getParameter("title");
                String description = req.getParameter("description");
                String fecha_start = req.getParameter("start");
                String fecha_end = req.getParameter("end");
                
                event.setSummary(title);
                event.setDescription(description);
                Start start = new Start(fecha_start);
                End end = new End(fecha_end);
                event.setStart(start);
                event.setEnd(end);
                
                gcResource.updateEvent("primary", event);
                
                log.log(Level.FINE, "Update request. Title=" + event.getSummary() + ", description= " + event.getDescription() + ". Forwarding to contact list view.");

                
                req.setAttribute("message", "Song updated successfully");
                req.setAttribute("evento", event);
                req.getRequestDispatcher("/GoogleCalendarEventList").forward(req, resp);
            } else {
                log.info("Trying to access Google Calendar without an access token, redirecting to OAuth servlet");
                req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
            }
        } else {
            log.warning("Invalid id for update!");
            req.getRequestDispatcher("/GoogleCalendarEventList").forward(req, resp);
        }
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
