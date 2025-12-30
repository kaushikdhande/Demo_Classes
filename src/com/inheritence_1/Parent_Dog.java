package com.inheritence_1;

public class Parent_Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent1{
	Animal disp() {
	Animal a=new Animal();
	return a;
	}
}
class child extends Parent1{
	Dog disp() {
	Dog d=new Dog();
	return d;
	}
}
class Animal{
	
}
class Dog extends Animal{
	
}