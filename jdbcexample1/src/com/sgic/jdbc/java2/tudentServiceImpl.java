package com.sgic.jdbc.java2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class tudentServiceImpl implements StudentService {

	@Override
	public void saveStudent(student Student) {
		// TODO Auto-generated method stub
		Connection con ;
        con=connection.getConnection();
        try {
			PreparedStatement posted = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+student.getId()+"', '"+student.getName()+"', '"+student.getAge()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
        
	}

}
