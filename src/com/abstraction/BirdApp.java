package com.abstraction;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 	Sparrow s =new Sparrow();		// we cannot instanciate an abstract class due to incomplete
		duty(new VegSparrow());
		duty(new NonVegSparrow());

	}
	static void duty(Bird b) {
		b.eat();
		b.fly();

}
}
//rule 1 

//abstract class Sparrow{
//	abstract void eat();
//	void fly() {
//		System.out.println("sparrow is flying !");
//	}
//}
//----------------------------------------------------------------------------------

//rule 2

abstract class Bird{
	abstract void eat();	//pure abstract class 
	abstract void fly();
	
}

//class Sparrow extends Bird{		//The type Sparrow must implement the inherited abstract method Bird.fly()
//	void eat() {						impure abstract class
//		System.out.println("eat sparrow");
//	}
//}
//-------------------------------------------------------------------------------------
//rule 3
 abstract class Sparrow extends Bird{		//The type Sparrow must implement the inherited abstract method Bird.fly()
	void fly() {
		System.out.println("fly sparrow");
	}
}
 class VegSparrow extends Sparrow{
	 void eat() {
		 System.out.println("Veg arrow");
	 }
 }
 class NonVegSparrow extends Sparrow{
	 void eat() {
		 System.out.println("non Veg arrow");
	 }
 }