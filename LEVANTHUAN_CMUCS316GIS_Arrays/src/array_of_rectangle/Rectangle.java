package array_of_rectangle;

import java.util.Scanner;

public class Rectangle {
	private double width;
	private double length;
	public Rectangle()
	{
		length=width=0;
	}
	
	public			Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public  void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length:");
		length = kb.nextDouble();
		System.out.println("Enter width:");
		width = kb.nextDouble();
	}
	public double getlength()
	{
		return length;
	}
	public void setlength(double LENGTH)
	{
		length=LENGTH;
	}
	public double getwidth()
	{
		return width;
	}
	public void setwidth(double WIDTH)
	{
		length=WIDTH;
	}
	public void output() {
		System.out.println("the length: "+length);
		System.out.println("the width:" + width);
	}
	public String toString() {
		return "the length: "+length + "   " +  "the width:" + width;
	}
	
	public  double  area() {
		return length * width;
	}
	
	public double perimeter() {
		return (length + width)*2;
	}
	
	
	public static void main(String[] args) {
		Rectangle  rec1 = new Rectangle (6,7);//rec1 = @1
		rec1.output();
		System.out.println(    rec1   );
		System.out.println(    rec1.area()   );
		System.out.println(    rec1.perimeter()    );
		
		Rectangle  rec2 = new Rectangle (16,7);// rec2 = @2
		rec2.output();
		System.out.println(    rec2   );
		System.out.println(    rec2.area()   );
		System.out.println(    rec2.perimeter()    );
		
		Rectangle  rec3 = new Rectangle (8,10);// rec3=@3
		rec1.output();
		System.out.println(    rec3   );
		System.out.println(    rec3.area()   );
		System.out.println(    rec3.perimeter()    );
		
		Rectangle  rec4 = new Rectangle (56,77);//rec4=@4
		rec1.output();
		System.out.println(    rec4   );
		System.out.println(    rec4.area()   );
		System.out.println(    rec4.perimeter()    );
	}


	

}
	