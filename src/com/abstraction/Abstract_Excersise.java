package com.abstraction;

public class Abstract_Excersise {

	public static void main(String[] args) {
		show(new Audi());
		show(new BMW()); 
		show(new Ferrari());
		
	}
	static void show(Car c) {
		c.drive();
	}

}


abstract class Car{
	abstract void drive();
}

class Audi extends Car{
	void drive() {
		System.out.println("driving  audi ....");
	}
}

class BMW extends Car{
	void drive() {
		System.out.println("driving  BMW ....");
	}
}
class Ferrari extends Car{
	void drive() {
		System.out.println("driving  Ferrari ....");
	}
}

