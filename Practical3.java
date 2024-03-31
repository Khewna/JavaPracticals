package Practicals;

import java.util.*;

public class Practical3 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first input value:");
		int a = sc.nextInt();
		System.out.print("Enter second input value:");
		int b = sc.nextInt();
		System.out.print("Enter third input value:");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The greatest number is: "+a);
		}
		if(b>a && b>c)
		{
			System.out.println("The greatest number is: "+b);
		}
		if(c>b && c>a)
		{
			System.out.println("The greatest number is: "+c);
		}
		

	}

}
