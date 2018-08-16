package com.googleapi.repository;

import java.util.ArrayList;
import java.util.Map;

public interface CalendarListRepository {

	public void storeCalendarList(String tokenID, String con);
	
	public ArrayList<Map<String,Object>> getCalendarList(String accessRole, String con);
}
