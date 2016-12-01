package com.niit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String JDBC_URL=" jdbc:h2:tcp://localhost/~/testdb";
	private static final String DRIVER_CLASS="org.h2.Driver";
	private static final String JDBC_USERNAME="sa";
	private static final String JDBC_PASSWORD="";
	
	private static Connection con = null;
	
private DBUtil(){}
public static Connection getConnection1()
{
	if(con==null)
	{
		try {
			Class.forName(DRIVER_CLASS);
			System.out.println("driver loaded successfully");
		
		con= DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
		     System.out.println("driver loaded successfully");
		} 
		
		
		
		catch (ClassNotFoundException | SQLException e)
		{
			
			System.out.println("Driver loading or connection is failed:" + e.getMessage());
		}
	}
	return con;
	
}
public static Connection getConnection() {
	
	
	
	
	
	return null;
}

}



