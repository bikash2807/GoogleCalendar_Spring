# GoogleCalendar_Spring
GoogleCalendar API implementation through Spring Framework

# Interfaces Used in Project
**1. AuthorizationService :**
 > It has one method "**getTokenID()**" , which will return Google TokenID in return, which is used further in different Google Calendar API's to fetch data.
      
**2. CalendarEventRepository :**
> It has two methods :<br/>
> **a) storeCalendarEventList(String tokenID, String con) :** Takes TokenID and Database connection in input, based on tokenID  GoogleCalendarEventList API is called and response is stored in database.<br/>
> **b) getCalendarEventList(String calendarID, String con) :** Takes calendarID and Database connection in input, based on calendarID data is fetched from DB and return list of events.
      
**3. CalendarListRepository :**
> It has two methods :<br/>
> **a) storeCalendarList(String tokenID, String con) :** Takes TokenID and Database connection in input, based on tokenID  GoogleCalendarList API is called and response is stored in database.<br/>
> **b) getCalendarList(String accessRole, String con) :** Takes accessRole and Database connection in input, based on accessRole data is fetched from DB and return list of events.
      
**4. DataSourceRepository :**
> It has one method "**dbConnectionManager(String dbURL, String user, String pwd)**" , which will return DB connection.
