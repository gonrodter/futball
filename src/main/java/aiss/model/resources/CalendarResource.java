package aiss.model.resources;

import java.io.UnsupportedEncodingException;


import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.gcalendar.Event;


public class CalendarResource {
    private final String access_token;
	private static final String Calendar_API_KEY = "AIzaSyBwrmbzgXZxYeRieaTko6p-00wShTxYH2g";
    private String uri = "https://www.googleapis.com/calendar/v3";
    
    public CalendarResource(String access_token) {
        this.access_token = access_token;
    }
//    
//	public Calendario getCalendario() {
//		
//		ClientResource cr = null;
//		Calendario calendar = null;
//		try {
//			cr = new ClientResource(uri + "/calendars" + "?access_token=" + access_token );
//			calendar = cr.get(Calendario.class);
//			
//		} catch (ResourceException re) {
//			System.err.println("Error when retrieving the calendar: " + cr.getResponse().getStatus());
//		}
//		
//		return calendar;
//	}
	
    public Event getEvents(String calendarId) {
        ClientResource cr = null;
        Event events = null;
        try {
            cr = new ClientResource(uri + "/calendars/" + calendarId + "/events?access_token=" + access_token);
            events = cr.get(Event.class);

        } catch (ResourceException re) {
        	System.err.println("Error when retrieving all events: " + cr.getResponse().getStatus());
        }

        return events;

    }
    
    public Event getEvent(String calendarId, String eventId) {

        ClientResource cr = null;
        Event event = null;
        try {
            cr = new ClientResource(uri + "/calendars/" + calendarId + "/events/" + eventId + "?access_token=" + access_token);
            event = cr.get(Event.class);

        } catch (ResourceException re) {
        	System.err.println("Error when retrieving the event: " + cr.getResponse().getStatus());
        }

        return event;

    }
    
    public Event addEvent(String calendarId, Event event) throws UnsupportedEncodingException {
		
		ClientResource cr = null;
		Event added_event = null;
		try {
			cr = new ClientResource(uri + "/calendars/" + calendarId + "/events?access_token=" + access_token);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			added_event = cr.post(event,Event.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when adding the event: " + cr.getResponse().getStatus());
		}
		
		return added_event;
    }
    
    
    public boolean updateEvent(String calendarId, Event event) {
		ClientResource cr = null;
		boolean success = true;
		try {
			cr = new ClientResource(uri + "/calendars/" +  calendarId + "/events/" + event.getId() + "?access_token=" + access_token);
			cr.put(event);
			
		} catch (ResourceException re) {
			System.err.println("Error when updating the event: " + cr.getResponse().getStatus());
			success = false;
		}
		
		return success;
	}
    
	public boolean deleteEvent(String calendarId, String eventId) {
		ClientResource cr = null;
		boolean success = true;
		try {
			cr = new ClientResource(uri + "/calendars/" + calendarId + "/events/" + eventId + "?access_token=" + access_token);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			cr.delete();
			
		} catch (ResourceException re) {
			System.err.println("Error when deleting the event: " + cr.getResponse().getStatus());
			success = false;
		}
		
		return success;
	}

}
