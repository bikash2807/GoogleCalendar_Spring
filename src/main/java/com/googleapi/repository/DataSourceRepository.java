package com.googleapi.repository;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataSourceRepository {
	
	public String dbConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException;

}
