package com.api.googlecalendar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.googleapi.repository.AuthorizationService;
import com.googleapi.repository.CalendarEventRepository;
import com.googleapi.repository.CalendarListRepository;
import com.googleapi.repository.DataSourceRepository;

//@SpringBootApplication
public class GoogleCalendarApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Map<String, Object>> list = new ArrayList<>();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AuthorizationService authService = (AuthorizationService) context.getBean("authorizationService");
		String tokenID = authService.getTokenID();
		
		DataSourceRepository dbSource = (DataSourceRepository) context.getBean("dataSourceRepository");
		String con = dbSource.dbConnectionManager("jdbc:mysql://127.0.0.1:3306/userData", "root", "redhat");
		
		CalendarListRepository calListRepo = (CalendarListRepository) context.getBean("calendarListRepository");
		calListRepo.storeCalendarList(tokenID, con);
		
		list = calListRepo.getCalendarList("reader", con);
		System.out.println("Calendar List : "+list);
		
		CalendarEventRepository calEvent = (CalendarEventRepository) context.getBean("calendarEventRepository");
		calEvent.storeCalendarEventList(tokenID, con);
		
		list = calEvent.getCalendarEventList("bikash.kaushik@fosteringlinux.com", con);
		System.out.println("Calendar Event List : "+list);
		
		
		
	}
}
