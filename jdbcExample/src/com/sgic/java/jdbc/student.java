package com.sgic.java.jdbc;
import java.sql.*;

public class student {
	 
    public static void main(String[] args) throws Exception 
    {
    	savestudent();
    }
    	public static void savestudent() throws Exception{
    	    final String var1 = "001";
    	    final String var2 = "Miller";
    	    final String var3 = "54";
    	    try{
    	        Connection con ;
    	        con=connection.getConnection();
    	        PreparedStatement posted = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+var1+"', '"+var2+"', '"+var3+"')");
    	        //PreparedStatement posted1 = con.prepareStatement("INSERT INTO student (student_id, student_name, student_age) VALUES ('"+002+"', '"+44+"', '"+56+"')");
    	        posted.executeUpdate();
    	        //posted1.executeUpdate();
    	    } catch(Exception e){System.out.println(e);}
    	    finally {
    	        System.out.println("Insert Completed.");
    	    }
    	}
    	
    	
    }




