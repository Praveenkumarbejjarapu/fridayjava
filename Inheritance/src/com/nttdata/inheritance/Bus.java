package com.nttdata.inheritance;

public class Bus extends Vehicle
{
int noofseats;
public Bus(String vehicleno, String brandname,int noofseats) {
		super(vehicleno, brandname);
		// TODO Auto-generated constructor stu
this.noofseats=noofseats;
}
public void displaybus() {
	System.out.println("bus details");
	System.out.println("bus number "+vehicleno);
	System.out.println("brand is " + brandname);
}

}