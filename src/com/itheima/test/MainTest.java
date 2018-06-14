package com.itheima.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	public static void main(String[] args) {
		Connection conn  = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from t_stu";
			ts = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println("id="+id+"===name="+name+);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
