package com.nttdata;

import java.util.Scanner;

public class Product {
int product_id;
String product_name;
void display()
{
	System.out.println("enter product details");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter product id");
	product_id=sc.nextInt();
	System.out.println("product name");
	product_name=sc.next();
}
void displaydetsils()
{
	
	System.out.println("product id is " + product_id);
	System.out.println("product name is "+ product_name);
}
}
