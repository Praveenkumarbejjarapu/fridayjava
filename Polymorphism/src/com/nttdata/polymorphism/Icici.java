package com.nttdata.polymorphism;

public class Icici extends Bank{
int intrestRate=8;
	public Icici(int bankName,int a,int intrestRate) {
		super(bankName,a);
		this.intrestRate=intrestRate;
		// TODO Auto-generated constructor stub
	}
void display() {
	System.out.println("icici details are ");
	int a=8;
	System.out.println("icici bank intrest rate is "+ a*intrestRate);
}
}
