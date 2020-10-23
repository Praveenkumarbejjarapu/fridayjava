package com.nttdata;

public class Car extends Vehicle {
int seats;
	public Car(String vehicleno, String brand, int model,int seats) {
		super(vehicleno, brand, model);
		// TODO Auto-generated constructor stub
		this.seats=seats;
	}
	void displaydetails()
	{
		System.out.println(" car details are");
	System.out.println("vehicle number is " + vehicleno);	
	System.out.println("vehicle brand is "+ brandname);
	System.out.println("vehicle model is " + model);
	
}
}
