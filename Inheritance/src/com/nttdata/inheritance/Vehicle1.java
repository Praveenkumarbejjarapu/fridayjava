package com.nttdata.inheritance;

public class Vehicle1 {
	String vehicleno;
	String brandname;
	Engine engine;
	public Vehicle1(String vehicleno, String color) {
		this.vehicleno = vehicleno;
		this.brandname = brandname;
	}
	void start() {
		System.out.println("start vehicle");
	}
	void stop()
	{
		System.out.println("stop vehicle");
	}
	}


