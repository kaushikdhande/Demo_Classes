package com.Shapes;

public class Trapezium extends Shapes {
	double a; double b; double c; double d; double height;
	Trapezium(double a, double b, double c, double d, double height) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.height=height;
		
	}
	double calculateArea() {
		// TODO Auto-generated method stub
		return  0.5 * (a + b) * height;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return a + b + c + d;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
