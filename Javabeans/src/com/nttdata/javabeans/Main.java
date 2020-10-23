
package com.nttdata.javabeans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student("john", 432, "cse");
Marks m=new Marks("java", 70);
m.display_marks(s);
s.display_student(m);

	}

}
