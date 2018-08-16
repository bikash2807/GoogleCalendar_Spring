package com.api.googlecalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.googleapi.repository.AuthorizationService;
import com.googleapi.repository.CalendarEventRepository;
import com.googleapi.repository.CalendarListRepository;
import com.googleapi.repository.DataSourceRepository;
import com.googleapi.repositoryimpl.AuthorizationServiceImpl;
import com.googleapi.repositoryimpl.CalendarEventRepositoryImpl;
import com.googleapi.repositoryimpl.CalendarListRepositoryImpl;
import com.googleapi.repositoryimpl.DataSourceRepositoryImpl;

@Configuration
//@ComponentScan(basePackages = "com.api.googlecalendar")
@PropertySource(value = {"classpath:application.properties"})
public class AppConfig {

	@Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationServiceImpl();
    }
	
	@Bean
    public CalendarListRepository calendarListRepository() {
        return new CalendarListRepositoryImpl();
    }
	
	@Bean
    public CalendarEventRepository calendarEventRepository() {
        return new CalendarEventRepositoryImpl();
    }
	
	@Bean
    public DataSourceRepository dataSourceRepository() {
        return new DataSourceRepositoryImpl();
    }
	
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	 }
	
}
