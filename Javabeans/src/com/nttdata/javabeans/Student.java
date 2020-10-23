package com.nttdata.javabeans;

public class Student {
private String s_name;
private int s_roll_no;
private String stream;

public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public int getS_roll_no() {
	return s_roll_no;
}
public void setS_roll_no(int s_roll_no) {
	this.s_roll_no = s_roll_no;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public Student(String s_name, int s_roll_no, String stream) {
	super();
	this.s_name = s_name;
	this.s_roll_no = s_roll_no;
	this.stream = stream;
}
public void display_student(Marks m) {
	System.out.println("marks details are");
	System.out.println("student marks "+m.getMarks() +"\t student subject is "+m.getSubject_name());
	
}
}
