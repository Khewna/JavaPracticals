package Practicals;

import java.util.*;

public class Practical9 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first input value:");
		float a = sc.nextFloat();
		System.out.println("Enter second input value:");
		float b = sc.nextFloat();
		
		System.out.print("a: "+a);
		System.out.println("\nb: "+b);
		
		if(a == b)
		{
			System.out.print("Both values are equal");
		}
		else
		{
			System.out.print("Both values are different");
		}
	}

}
