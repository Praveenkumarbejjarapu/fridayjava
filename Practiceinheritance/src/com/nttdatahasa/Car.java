package com.nttdatahasa;

public class Car extends Vehicle {
Engine engine;
int no_of_seats;
	public Car(String vehicleno, String brandname, int model, int no_of_seats,Engine engine) {
		super(vehicleno, brandname, model);
		// TODO Auto-generated constructor stub
		this.no_of_seats=no_of_seats;
		this.engine=engine;
	}
void dispcar() {
	System.out.println("car details are");
	System.out.println("car number is "+ vehicleno +" brand name is "+ brandname +" car model is "+ model + "");
	System.out.println("engine details are");	
	System.out.println(" engine model is "+engine.engine_model +"engine manufacturing year  is "+engine.manufacturing_year);

}
}
