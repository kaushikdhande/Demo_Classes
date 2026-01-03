package com.interfaces;

		//method overridding example
public class ParentApp_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_3 p=new Parent_3();
		p.disp();
	Child_3 c=new Child_3();
		c.disp();
		Parent_3 cp=new Child_3();		// jika obj uska method in MOvid (Object define karte),  in method hiding obj ko hid karata hai aur uske ref define karta hai(static )
		cp.disp();
	}

}

class Parent_3{
	static void disp() {
		System.out.println("this is parent ");
	}
}
class Child_3 extends Parent_3{
	static void disp() {
		System.out.println("this is child ");

	}
}