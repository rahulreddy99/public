package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlServer {
       
        
        
       
        	 private static Connection connection = null;
        	    //1.jdbc driver name
        	    private static String SQL_JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        	    // 2. Database URL, V_UDAY\FRAMEWORK is ServerName and JSF is DataBase name
        	    private static String URL = "jdbc:sqlserver://EVEREVER:1433;databaseName=phpTours;integratedSecurity=true";
        	    //String url ="jdbc:sqlserver://MYPC\\SQLEXPRESS;databaseName=MYDB;integratedSecurity=true";

        	    //3.Database credentials
        	    private static String USERNAME = "";//UserName
        	    private static String PASSWORD = "";//Password

        	public static void main(String[] args) {
        	    getLocalConnection();
        	}

        	public static Connection getLocalConnection() {
        	    try {
        	        Class.forName(SQL_JDBC_DRIVER);// Register jdbc driver
        	        //com.microsoft.sqlserver.jdbc.SQLServerDriver

        	        System.out.println("****Connect to Database****");

        	        //4. open a connection
        	        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        	        System.out.println("DataBase connect to: "+ connection.getMetaData().getDriverName());
        	        System.out.println("URL: "+ connection.getMetaData().getURL());
        	        Statement statement = connection.createStatement();
        	         String queryString = "select * from persons";
        	         ResultSet rs = statement.executeQuery(queryString);
        	         while (rs.next()) {
        	            System.out.println(rs.getString(1));
        	            System.out.println(rs.getString(2));
        	            System.out.println(rs.getString(3));
        	            System.out.println(rs.getString(4));
        	         }
        	        setConnectionClose();
        	        System.out.println("Database Connection Closed");
        	    } catch (Exception e) {
        	        e.printStackTrace();
        	        System.err.println("Exception in getLocalConeection() "+e.getMessage());
        	    }
        	    return connection;
        	}

        	public static void setConnectionClose() throws SQLException {
        	    if (connection != null) {
        	        connection.close();
        	    }
        	}

       
}
