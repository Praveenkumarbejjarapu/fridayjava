package com.nttdata;

import java.util.concurrent.Callable;

public class Product  implements Cloneable {
int product_id;
String product_name;
double product_price;
public Product(int product_id, String product_name, double product_price) {
	super();
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_price = product_price;
}
public void display()
{
	System.out.println("product details are");
	System.out.println("product id is "+product_id +" \t product name is " +product_name + "\t product price is " + product_price);
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/*@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}*/
}
