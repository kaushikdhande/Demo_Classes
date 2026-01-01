package com.abstraction;

public class Area_of_shape {

	public static void main(String[] args) {
		display1(new Circle(3));
		display1(new Triangle(4,3));
		display1(new Square(4.7f));
		display1(new Cyclinder(4,3));


	}
	static void display1(Shapes sp) {
		sp.findArea();
		sp.disArea();
	}

}

abstract class Shapes{
	 double area;
	static float pie=3.14f;
	static float half=0.5f;
	 abstract void findArea();
	abstract void disArea();
}
class Circle extends Shapes{
	
	float r;
	public Circle(float  r) {
		this.r=r;
		
	}
	
	 void findArea() {
			area=pie*Math.pow(r,2);
	}
	void disArea() {
		System.out.println("Area of Cirlce :"+ area);
	}
	
	
	
	
}
	class Triangle extends Shapes{
	    float b, h;
	    
	        public Triangle(float  b, float h) {
	            this.b = b;
	            this.h = h;
	        }
	    
	        void findArea() {
	            area = half * b * h;
	        }
	    
	        void disArea() {
	            System.out.println("Area of Triangle: " + area);
	        }

	}


class Square extends Shapes{
	float s;
	public Square(float s) {
		this.s=s;
	}
	
	 void  findArea() {
			area=s*s;

	}
	void  disArea() {
		System.out.println("Area of Sqaure :"+ area);
	}
}

class Cyclinder extends Shapes{
    float r, h;
    
        public Cyclinder(float  r, float h) {
            this.r = r;
            this.h = h;
        }
    
        void findArea() {
            area = (2*pie  * r * h)+ (2* pie *r*r) ;
        }
    
        void disArea() {
            System.out.println("Area of Cyclinder: " + area);
        }

}
