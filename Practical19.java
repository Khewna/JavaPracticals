package Practicals;

import java.util.Scanner;

class Shape
{
	double Area()
	{
		return 0.0d;
	}
	
	double Perimeter()
	{
		return 0.0d;
	}
}

class Circle extends Shape
{
	double c_r;
	
	Circle(double c_r)
	{
		this.c_r = c_r;
	}
	
	 double Perimeter()
	 {
		 return (2 * Math.PI * c_r);
	 }
	 
	 double Area()
	 {
		 return (Math.PI * c_r *c_r);
	 }
	 
	 void display1()
	 {
		 System.out.println("Radius of circle is: " +c_r);
		 System.out.println("Perimeter of circle is: " +Perimeter());
		 System.out.println("Area of the circle is: " +Area());
	 }
}

class Rectangle extends Shape
{
	double r_l, r_b;
	
	Rectangle(double r_l, double r_b)
	{
		this.r_l = r_l;
		this.r_b = r_b;
	}
	
	double Perimeter()
	{
		return(2 * (r_l + r_b));
	}
	
	double Area()
	{
		return(r_l * r_b);
	}
	
	void display2()
	{
		System.out.println();
		System.out.println("Length of rectangle is: " +r_l);
		System.out.println("Breadth of rectangle is: " +r_b);
		System.out.println("Perimeter of rectangle is: " +Perimeter());
		System.out.println("Area of rectangle is: " +Area());
	}
}

class Triangle extends Shape
{
	double t_s1, t_s2, t_s3, t_h;
	
	Triangle(double t_s1, double t_s2, double t_s3, double t_h)
	{
		this.t_s1 = t_s1;
		this.t_s2 = t_s2;
		this.t_s3 = t_s3;
		this.t_h = t_h;
	}
	
	double Perimeter()
	{
		return (t_s1 + t_s2 + t_s3);
	}
	
	double Area()
	{
		return((t_s3 *t_h)/2);
	}
	
	void display3()
	{
		System.out.println();
		System.out.println("First side of triangle is: " +t_s1);
		System.out.println("Second side of triangle is: " +t_s2);
		System.out.println("Third side or base of triangle is: " +t_s3);
		System.out.println("Height of the triangle is: " +t_h);
		System.out.println("Perimeter of triangle is: " +Perimeter());
		System.out.println("Area of the triangle is: " +Area());
	}
}


public class Practical19 {

	public static void main(String[] args) {
		Circle a = new Circle(5);
		a.display1();
		Rectangle b = new Rectangle(10,5);
		b.display2();
		Triangle c = new Triangle(10,5,15,10);
		c.display3();

	}

}
