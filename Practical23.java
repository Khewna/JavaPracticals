package Practicals;

import java.util.Scanner;

public class Practical23 {
	static int factorial(int n)
	{
		if(n == 0)
			return 1;
		else
			return(n * factorial(n-1));
	}
	
	public static void main(String args[])
	{
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter an input value: ");
		int a = sc.nextInt();
		fact = factorial(a);
		System.out.println("Factorial of the given number is: " +fact);
	}

}
