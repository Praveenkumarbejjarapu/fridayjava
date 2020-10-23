package com.nttdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
String name;
int id;
String city;
	public Employee(String name, int id, String city) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
}
	public static void main(String[] args) {
		List<Employee>l=new ArrayList<>();
l.add(new Employee("venky",310,"hyd"));
l.add(new Employee("warner",543,"banglore"));
l.add(new Employee("rahul",456,"pune"));
l.add(new Employee("maxwell",321,"delhi"));
Collections.sort(l,(e1,e2)->{
	return e1.name.compareTo(e2.name);
});

for(Employee e:l)
{
	System.out.println("employee names are " + e);
}
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

}
