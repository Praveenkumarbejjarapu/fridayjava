package com.nttdata.inheritance;

public class Car extends Vehicle{
int noofairbags;
	public Car(String vehicleno, String brandname,int noofairbags) {
		super(vehicleno, brandname);
		// TODO Auto-generated constructor stub
		this.noofairbags=noofairbags;
	}
void display() {
	System.out.println("details of car");
	System.out.println("vehicle no "+ vehicleno);
	System.out.println("brand is"+ brandname);
	
	System.out.println("airbags are "+ noofairbags);
}
}
