package com.sgic.java.jdbc;
import java.sql.*;
public class connection {
	
		private static final String  DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
		private static final String DB_USERNAME="root";
		private static final String DB_PASSWORD="Kumar@123";
		private static final String DB_URL="jdbc:mysql://localhost/school";
		
		private static Connection connection=null;
		
		static {
			try {
				Class.forName(DB_DRIVER_CLASS);
				connection=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
				System.out.print("ok");
			}catch(ClassNotFoundException  | SQLException e) {
				e.printStackTrace();
				System.out.print("fail");
			}
		}
		
		public static Connection getConnection() {
			return connection;
		
		}
		
		public static void main(String args[]) {
			getConnection();
		}
	}



