package com.nttdata;

public class Employee {
	int empid;
	String empname;
	String empaddress;
	public Employee(int empid, String empname, String empaddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}
	public void display() {
		
		System.out.println("employee id "+ empid);
		System.out.println("employee name "+ empname);
		System.out.println("employee address "+ empaddress);
		
	}
}
