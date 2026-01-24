package com.Shapes;

 class Rectangle extends Shapes{

	double length;
	double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;

	}
	double calculateArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	
	double calculatePerimeter() {
		// TODO Auto-generated method stub
        return 2 * (length + breadth);
	}

	
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
