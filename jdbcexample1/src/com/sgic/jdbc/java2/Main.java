package com.sgic.jdbc.java2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student student1 =new student();
student1.setId(100);
student1.setName("bro");
student1.setAge("15");
StudentService StudentService = new tudentServiceImpl();
StudentService.saveStudent(student1);


	}

}
