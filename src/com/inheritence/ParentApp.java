package com.inheritence;

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
class GrandParent{
	int a=10;
//	public GrandParent() {
//		System.out.println("This is 1 parent constructor!");
//	}
}

class Parent extends GrandParent{
	int b=20;
//	public Parent() {
//		System.out.println("This is 2 parent constructor!");
//	}
}

class Child extends Parent{
//	int a=10;
//	public Child() {
//		System.out.println("This is child parent constructor!");
//	}
}
