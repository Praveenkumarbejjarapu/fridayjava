package com.nttdata;

public class Bus extends Vehicle {

	public Bus(String vehicleno, String brandname, int model) {
		super(vehicleno, brandname, model);
		// TODO Auto-generated constructor stub
	}
void  busdetails() {
	System.out.println("bus details are");
	System.out.println(" bus number is " + vehicleno );
	System.out.println("bus brand name is " + brandname);
	System.out.println("bus model is " + model);
}
}
