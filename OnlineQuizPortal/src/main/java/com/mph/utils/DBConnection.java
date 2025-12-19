package com.mph.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public static Connection getConnection() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/quiz";
	String username="root";
	String password="root@39";
	
	return DriverManager.getConnection(url,username,password);
}
}
