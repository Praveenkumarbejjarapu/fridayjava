package com.nttdatahasa;

public class Bus  extends Vehicle{
int noofseats;
Engine engine;
	public Bus(String vehicleno, String brandname, int model,int noofseats,Engine engine) {
		super(vehicleno, brandname, model);
		// TODO Auto-generated constructor stub
		this.noofseats=noofseats;
		this.engine=engine;
	}
	void dispbus() {
		System.out.println("bus details are");
		System.out.println("bus number is "+ vehicleno +" bus  brand name is "+ brandname +" bus  model is "+ model + "");
		System.out.println("engine details are");	
		System.out.println(" engine model is "+engine.engine_model +"engine manufacturing year  is "+engine.manufacturing_year);

	}
}