package com.nttdata;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p=new Product(10,"books",1500);
p.display();
try {
	Product p1= (Product)p.clone();
	p1.display();
	Product p2=(Product)p.clone();
	p2.display();
	
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
