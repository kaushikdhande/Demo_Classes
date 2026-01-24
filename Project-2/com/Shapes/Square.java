package com.Shapes;

 class Square extends Shapes {
	 double side;
	public Square(double side) {
		this.side=side;
	}
	double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
