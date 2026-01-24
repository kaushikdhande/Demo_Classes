package com.Shapes;

public class Cylinder extends Shapes {
	double radius ;
	double height;
	
	public Cylinder(double radius,double height ) {
		this.radius=radius;
		this.height=height;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return  2 * Math.PI * radius * (radius + height);
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return  2 * Math.PI * radius * (radius + height);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

}
