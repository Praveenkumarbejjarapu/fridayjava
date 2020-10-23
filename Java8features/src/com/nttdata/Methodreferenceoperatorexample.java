package com.nttdata;

public class Methodreferenceoperatorexample {
static void Hello()
{
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello h=Methodreferenceoperatorexample::Hello;
System.out.println(h);
h.print();
	}

}
