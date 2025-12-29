package com.inheritence;

public class Parent1App {

    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println(c.a + " " + c.b);
    }
}

class Parent1 {
    int a;
    int b;

    public Parent1() {
        a = 10;
        b = 20;
    }

    public Parent1(int a, int b) {   // ✅ FIXED
        this.a = a;
        this.b = b;
    }
}

class Child1 extends Parent1 {

    public Child1() {
        super();      // calls Parent1()
        a = 30;
        b = 40;
    }

    public Child1(int a, int b) {
    	 this.a = a;
     this.b = b;  // calls Parent1(int, int)
    }
}
