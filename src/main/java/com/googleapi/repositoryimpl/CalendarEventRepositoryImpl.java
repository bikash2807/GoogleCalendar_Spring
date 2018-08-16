package com.googleapi.repositoryimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.googleapi.repository.CalendarEventRepository;

public class CalendarEventRepositoryImpl implements CalendarEventRepository {

	private String eventID;
	private String eventDescription;
	private String eventSummary;
	private String eventLocation;
	private String eventCreator;
	private String eventOrganizer;
	private String startDayTime;
	private String startEndTime;
	private ArrayList<Map<String,String>> attendees;
	
	
	@Override
	public void storeCalendarEventList(String tokenID, String con) {
		// TODO get Calendar EventList from Google based on generated TokenID and store it in DB
		System.out.println("In storeCalendarEventList Method");
		
		System.out.println("Connection Message : "+con);
		System.out.println("Calendar Event List Stored in DB with Calendar TokenID : "+tokenID);
	}

	@Override
	public ArrayList<Map<String, Object>> getCalendarEventList(String calendarID, String con) {
		// TODO get Calendar Event List based on calendarID from DB
		System.out.println("In getCalendarEventList Method");
		System.out.println("Connection Message : "+con);
		System.out.println("Calendar Event List for CalendarID : "+calendarID);
		ArrayList<Map<String, Object>> responseList = new ArrayList();
		Map<String, Object> map = new HashMap();
		ArrayList<Map<String, String>> attendeesList = new ArrayList();
		Map<String, String> attendeesMap = new HashMap();
		
		map.put("eventID", "3prt1fmbfqtd42iemu3t90kd4t");
		map.put("eventDescription", "\\n\\n\\npls attend the FUSE basics session \\nPresenter: Tejas\\n\\nregards,\\nNitu");
		map.put("eventSummary", "FUSE basics");
		map.put("eventLocation", "Gurgaon FL office");
		map.put("eventCreator", "nitu.gupta@fosteringlinux.com");
		map.put("eventOrganizer", "nitu.gupta@fosteringlinux.com");
		map.put("startDayTime", "2018-02-10T11:00:00+05:30");
		map.put("startEndTime", "2018-02-10T14:00:00+05:30");
		
		attendeesMap.put("email", "nitu.gupta@fosteringlinux.com");
		attendeesMap.put("responseStatus", "accepted");
		attendeesList.add(attendeesMap);
		
		map.put("attendees", attendeesList);
		
		responseList.add(map);
		return responseList;
	}

}
