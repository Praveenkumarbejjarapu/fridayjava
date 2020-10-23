package com.nttdata.inheritance;

public class Vehicle {
String vehicleno;
String brandname;
public Vehicle(String vehicleno,  String brandname)
{
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
