package com.googleapi.repositoryimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.googleapi.repository.CalendarListRepository;

public class CalendarListRepositoryImpl implements CalendarListRepository {

	private String id;
	private String summary;
	private String description;
	private String accessRole;
	
	@Override
	public void storeCalendarList(String tokenID, String con) {
		// TODO get Calendar List from Google based on generated TokenID and store it in DB
		System.out.println("In storeCalendarList Method");
		
		System.out.println("Connection Message : "+con);
		System.out.println("Calendar List Stored in DB with Calendar TokenID : "+tokenID);
		
	}

	@Override
	public ArrayList<Map<String, Object>> getCalendarList(String accessRole, String con) {
		// TODO get Calendar List based on accessRole from DB
		System.out.println("In getCalendarList Method");
		System.out.println("Connection Message : "+con);
		System.out.println("Calendar List for AccessRole : "+accessRole);
		ArrayList<Map<String, Object>> responseList = new ArrayList();
		Map<String, Object> map = new HashMap();
		
		map.put("id", "en.indian#holiday@group.v.calendar.google.com");
		map.put("summary", "Holidays in India");
		map.put("description", "Holidays in India");
		map.put("accessRole", "reader");
		
		responseList.add(map);
		return responseList;
	}

}
