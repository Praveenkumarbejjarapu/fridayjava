package com.nttdata.inheritance;

public class Main1{
	public static void main(String[]args)
	{
Vehicle v=new Vehicle("ap 34 rt3456","blue");
v.start();
v.stop();
Engine e=new Engine(2019,"latestmodel");
e.display();
}
}