package com.Shapes;
import java.util.*;
public class ShapesApp {	
	
	static void show(Shapes shape) {
		System.out.println("Area :"+shape.calculateArea());;
		System.out.println("Perimeter :"+shape.calculateCircumference());
		System.out.println("Circumference :"+shape.calculatePerimeter());
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the shape Number :");
	System.out.println("1.Circle");
	System.out.println("2.Rectangle");
	System.out.println("3.Sqaure");
	System.out.println("4.Triangle");
	System.out.println("5.Cylinder");
	System.out.println("6.Rhombus ");
	System.out.println("7.Trapezium ");
	System.out.println("8.Parallelogram ");
	
	int choice=sc.nextInt();
	switch(choice ) {
	case 1 :
		System.out.println("enter the radius :");
		show(new Circle(sc.nextDouble()));
		break;
	
	case 2 :
		System.out.println("enter the  length and breadth: ");
		show(new Rectangle(sc.nextDouble(),sc.nextDouble()));
		break;
	case 3 :
		System.out.println("enter the side :");
		show(new Square(sc.nextDouble()));
		break;
	
case 4 :
		System.out.println("enter the a,b,c,height,base :");
		show(new Triangle(sc.nextDouble(),
						  sc.nextDouble(),
						  sc.nextDouble(),
						  sc.nextDouble(),
						  sc.nextDouble())
				
				);
		break;
case 5 :
	System.out.println("enter the radius and height :");
	show(new Cylinder(sc.nextDouble(),sc.nextDouble()));
	break;
	
case 6 :
	System.out.println("enter the d1 and d2 and side :");
	show(new Rhombus(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
	break;
case 7 :
	System.out.println("enter the a,b,c,d ,height, side :");
	show(new Trapezium(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
	break;
case 8 :
	System.out.println("enter the base,height,side :");
	show(new Parallelogram(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
	break;
case 9 :	
	default:
    System.out.println("Invalid Choice");
    return;
}
sc.close();

	}
	}


