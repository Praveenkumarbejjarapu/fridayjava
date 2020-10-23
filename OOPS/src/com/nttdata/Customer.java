package com.nttdata;

public class Customer {
	String customername;
	String customeraddress;
	int mobileno;
	String product;
	public Customer(String customername, String customeraddress, int mobileno, String product) {
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobileno = mobileno;
		this.product = product;
	}
	void display()
	{
		System.out.println("customer name is " +customername);
		System.out.println("customer address is " +customeraddress);
		System.out.println("customer mobile number is " +mobileno);
		System.out.println("customer product is " +product);
	}
}
