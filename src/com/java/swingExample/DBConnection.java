package com.java.swingExample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    public static Connection getCon()
    {
    	Connection c = null;
	      Statement stmt = null;
	      try {
	    	Class.forName("org.postgresql.Driver");
	        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "1234");
	      }
	      catch (Exception e) {
	    	  e.printStackTrace();
	      }
	      return c;
    }
}
