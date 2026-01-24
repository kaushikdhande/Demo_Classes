package com.Shapes;

public class Rhombus extends Shapes {
	double d1;
	double d2; double side;
	Rhombus(double d1, double d2, double side) {
		this.d1=d1;
		this.d2=d2;
		this.side=side;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * d1 * d2;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return  (4 * side);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
