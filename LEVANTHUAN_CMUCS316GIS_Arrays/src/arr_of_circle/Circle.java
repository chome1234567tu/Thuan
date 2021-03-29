package arr_of_circle;

import java.util.Scanner;

import array_of_rectangle.Rectangle;

public class Circle {
	private double radius;
	public            Circle()
	{
		radius=0;
	}
	
	public			Circle(double r) {
		radius = r;
	}
	
	public  void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = kb.nextDouble();
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double RADIUS)
	{
		radius=RADIUS;
	}
	public void output() {
		System.out.println("the radius: "+radius);
		
	}
	public String toString() {
		return "the radius: "+radius;
	}
	
	public  double  area() {
		return radius*radius*3.14;
	}
	
	public double perimeter() {
		return 2*3.14*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle  cir = new Circle ();
		cir.input();
		cir.output();
		System.out.println(   cir    );
		System.out.println(    cir.area()   );
		System.out.println(    cir.perimeter()    );
	}

}
