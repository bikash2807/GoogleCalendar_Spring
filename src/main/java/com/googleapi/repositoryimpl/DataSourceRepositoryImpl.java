package com.googleapi.repositoryimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.googleapi.repository.DataSourceRepository;

public class DataSourceRepositoryImpl implements DataSourceRepository {

	private static Connection connection;
	
	public String dbConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException,SQLException {
		//Class for mysql
		//Class.forName("com.mysql.jdbc.Driver");
		/* Class.forName("org.postgresql.Driver");
		this.connection = DriverManager.getConnection(dbURL, user, pwd);*/
		
		//return this.connection;
		System.out.println("In dbConnectionManager Method");
		
		System.out.println("DB URL : "+dbURL);
		System.out.println("DB User : "+user);
		System.out.println("DB Password : "+pwd);
		System.out.println("Connection Established");
		return "Connection Established";
	}
	
	public static void closeConnection(){
        if(connection!=null){
            try {
            	connection.close();
            } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        }

    }

}
