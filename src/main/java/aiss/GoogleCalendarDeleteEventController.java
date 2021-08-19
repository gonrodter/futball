package aiss;

import aiss.model.resources.CalendarResource;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleCalendarDeleteEventController extends HttpServlet {

    private static final Logger log = Logger.getLogger(GoogleCalendarDeleteEventController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("id");
        if (id != null && !"".equals(id)) {
            String accessToken = (String) req.getSession().getAttribute("GoogleCalendar-token");
            if (accessToken != null && !"".equals(accessToken)) {
                CalendarResource gcResource = new CalendarResource(accessToken);
                gcResource.deleteEvent("primary", id);
                log.info("Event with id '" + id + "' deleted!");
                req.getRequestDispatcher("/GoogleCalendarEventList").forward(req, resp);
            } else {
                log.info("Trying to access Google Calendar without an access token, redirecting to OAuth servlet");
                req.getRequestDispatcher("/AuthController/GoogleCalendar").forward(req, resp);
            }
        } else {
            log.warning("Invalid id for delete!");
            req.getRequestDispatcher("/GoogleCalendarEventList").forward(req, resp);
        }
    }
}
