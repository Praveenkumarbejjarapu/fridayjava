package com.nttdata;

import java.util.function.BiFunction;

public class Addition1 {
static int add(int a,int b)
{
	return a+b;
}
static float add1(float a,float b)
{
	return a-b;
}
int add2(int a,int b) {
	
	return a+b;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer, Integer, Integer>add=Addition1::add;
int res=add.apply(20, 12);
System.out.println("addition is " + res);                //bifunction interface takes 2 types of input argument 
                                                         //   and returns 3 type as return type argument
BiFunction<Integer, Float, Float>add1=Addition1::add1;
float res1=add1.apply(67, 56.98f);
System.out.println("subtraction is " + res1);
BiFunction<Integer, Integer,Integer>add2=(a,b)->(a+b);
int res3=add2.apply(3,67);
System.out.println(res3);
BiFunction<Integer, Integer, Integer> add3=(a,b)->(a+b);
int res4=add3.apply(4, 5);
System.out.println(res4);
	}

}
