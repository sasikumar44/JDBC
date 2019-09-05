package com.sgic.java.jdbc;

import java.sql.Connection;

class services_implementation implements student_services {

	@Override
	public void savestudent() {
		// TODO Auto-generated method stub
		final String var1;
		final String var2 ;
		final String var3 ;
		Connection con ;
        con=connection.getConnection();
       // PreparedStatement posted = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+var1+"', '"+var2+"', '"+var3+"')");
		
	}

	@Override
	public void updatestudent() {
		// TODO Auto-generated method stub
		
	}

}
