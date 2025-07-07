package com.setterInjection;

public class Student {

	private String studentName;

	public void setStudentNamae(String studentName) {
		this.studentName = studentName;
	}

	public void displayName() {
		System.out.println("Student Name : " + studentName);
	}
}
