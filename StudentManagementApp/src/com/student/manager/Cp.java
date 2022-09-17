package com.student.manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {
	
	static Connection con;

	public static Connection createC() {
		try {
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String user="root";
			String password="79284";
			String url="jdbc:mysql://localhost:3306/studentmanager";
			con=DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
