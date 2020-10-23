package com.nttdata.polymorphism;

public class Area {

void Area(int a) {
	System.out.println("area is "+a*a);
}
int Area(int a,int b)
{
	System.out.println("area is" +a*b);
	return a*b;
}
void Area(int a,int b, int c)
{
	System.out.println("area is "+a*b*c);
}
}
