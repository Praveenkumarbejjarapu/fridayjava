package com.nttdata.javabeans2;

public class Marks  implements Studentdao{
	int marks;
	public Marks(int marks) {
		super();
		this.marks = marks;
	}
	@Override
	
	public void setmarks(Student student) {
		// TODO Auto-generated method stub
		System.out.println("student details are");
		System.out.println("student name is "+student.getStudent_name()+"\t student roll number is "+ student.getStudent_rollno() +" \t"
				+ "student address "+ student.getStudent_address());
	System.out.println("marks are "+marks);
	}

}
