package com.setterinjection;

public class Student {

	private String StudentName;

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	public void displayName() {
		System.out.println("Student name is : " + StudentName);
	}

}
