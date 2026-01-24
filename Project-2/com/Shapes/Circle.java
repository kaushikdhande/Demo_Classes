package com.Shapes;

 class Circle extends Shapes {
	 
	 double radius;
	 
	 public Circle(double radius) {
		 this.radius=radius;
	 }
	 
	double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

}
