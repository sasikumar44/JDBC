package com.sgic.jdbc.java2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Student1 {
  public static void main(String []args) throws SQLException {
	  student st1 =new student();
	  st1.setName("Sasi");
	  st1.setAge("54");
	  st1.setId(005);
	  
	  student st2 = new student();
	  st2.setId(006);
	  st2.setName("Sasik");
	  st2.setAge("23");
	  
	  Connection con ;
      con=connection.getConnection();
      PreparedStatement posted = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+st1.getId()+"', '"+st1.getName()+"', '"+st1.getAge()+"')");
      PreparedStatement posted1 = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+st2.getId()+"', '"+st2.getName()+"', '"+st2.getAge()+"')");
      posted.executeUpdate();
      posted1.executeUpdate();
	  
  }
 
}

