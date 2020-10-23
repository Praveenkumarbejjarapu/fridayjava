package com.nttdata;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a1=(a,b)->System.out.println("addition of two numbers are " + (a+b));
a1.add(10, 23);
Subtraction s1=(a,b)->{System.out.println("subtraction of two numbers are " + (a-b));};
s1.Subtraction(23, 10);
Multiplication m1=(a,b)->{System.out.println("multiplication of two numbers are " + (a*b));};
m1.multiplication(10, 23);
Division d1=(a,b)->{System.out.println("division  of two numbers are " + (a%b));};
d1.division(10,24);

	}

}
//functional interface which has only one abstract method ,multple functional interfaces can have one main class