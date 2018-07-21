package com.capgemini.bankwallet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcUtil {
   static Connection con;
	public static Connection GetConnection() {
		Connection con =null;
	  try {
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentdb", "root", "Capgemini@123");
			
	} catch (SQLException e) {

   e.printStackTrace();
	}
	return con;
			
		}

}
	
	
	

