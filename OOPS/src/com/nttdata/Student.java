package com.nttdata;

import java.util.Scanner;

public class Student {

	
int id;
String name;
String address;
double marks;
void inputdetails(int id,String name,String address,double marks)
{
	
Scanner sc=new Scanner(System.in);
System.out.println("enter details");
System.out.println("enter id");
id=sc.nextInt();
System.out.println("enter name");
name=sc.next();
System.out.println("enter address");
address=sc.next();
System.out.println("enter marks");
marks=sc.nextDouble();





	}

}
