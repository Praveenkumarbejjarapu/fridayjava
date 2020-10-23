package com.nttdata.inheritance;

public class Engine {
int model;
String enginename;
public Engine(int model, String enginename) {
	super();
	this.model = model;
	this.enginename = enginename;
}
void display()
{
	System.out.println("detaisl of engine model" + model);
	System.out.println("engine name "+ enginename);
}
}
