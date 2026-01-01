package com.abstraction;

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c=new Child();
//		c.disp();
	}

}
abstract class Parent{
	int x=10;
//	final abstract  void disp();
}
class Child extends Parent{
	int x=20;
	void disp() {
		System.out.println("this child methodd");
	}
}		//we can't override final methods 