package com.nttdatahasa;

public class Mainmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e=new Engine(2018,2019);
Car c=new Car("ap 13 r 3456","skoda",2019,5,e);
c.dispcar();
Bus b=new Bus("ap 23c 6787","tata", 2018, 50,e);
b.dispbus();
	}

}
