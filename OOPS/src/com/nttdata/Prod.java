package com.nttdata;

import java.util.Scanner;

public class Prod {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
Product p=new Product();
for(int i=0;i<100;i++)
{
	System.out.println("welcome to product simulation");
System.out.println(" do you want to enter product details: yes or no");
String yes=sc.next();
if(yes.equals("yes"))
{
p.display();
p.displaydetsils();

	}
else
{
	System.out.println("no details");
}
}}}