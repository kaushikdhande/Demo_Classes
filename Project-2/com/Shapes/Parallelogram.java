package com.Shapes;

public class Parallelogram extends Shapes{
	double base; double height; double side;
	 Parallelogram(double base, double height, double side) {
		 this.base=base;
		 this.height=height;
		 this.side=side;
	 }
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return base * height;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (2 * (base + side));
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
