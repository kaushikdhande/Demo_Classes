package com.Shapes;

  class Triangle extends Shapes{
	  double a, b, c, height, base;

	    Triangle(double a, double b, double c, double base, double height) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.base = base;
	        this.height = height;
	    }

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
        return a + b + c;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
