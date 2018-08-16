package com.googleapi.repository;

import java.util.ArrayList;
import java.util.Map;

public interface CalendarEventRepository {

	public void storeCalendarEventList(String tokenID, String con);
	
	public ArrayList<Map<String,Object>> getCalendarEventList(String calendarID, String con);
}
