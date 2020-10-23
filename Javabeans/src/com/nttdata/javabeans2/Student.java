package com.nttdata.javabeans2;

public class Student
{
	private String student_name;
	private int student_rollno;
	private String student_address;
	public Student(String student_name, int student_rollno, String student_address) {
		super();
		this.student_name = student_name;
		this.student_rollno = student_rollno;
		this.student_address = student_address;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_rollno() {
		return student_rollno;
	}
	public void setStudent_rollno(int student_rollno) {
		this.student_rollno = student_rollno;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	
	

}
