package com.nttdata.javabeans;

public class Marks {
private String subject_name;
private int marks;

public String getSubject_name() {
	return subject_name;
}
public void setSubject_name(String subject_name) {
	this.subject_name = subject_name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Marks(String subject_name, int marks) {
	super();
	this.subject_name = subject_name;
	this.marks = marks;
}
void display_marks(Student s) {
	System.out.println("student  details are");
	System.out.println("student name is " + s.getS_name()+ "\t student roll number is " +s.getS_roll_no() +"\t   student stream is "+ s.getStream());
}
}
