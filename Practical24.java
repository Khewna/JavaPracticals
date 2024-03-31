package Practicals;

import java.util.*;

public class Practical24 {
	public static void main(String args[])
	{
		int a,b, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		
		while(a>0)
		{
			b = a%10;
			c = c + b;
			a = a/10;
		}
		System.out.println("The sum of digits of number is: " +c);
	}

}


