package com.itheima.test;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTest {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
