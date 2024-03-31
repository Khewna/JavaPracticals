package Practicals;

import java.util.*;

public class Practical7 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value(in Celsius):");
		int a = sc.nextInt();
		
		double b = (a*9)/5 + 32;
		System.out.println("Value(in Fahrenheit): "+b);
	}

}
