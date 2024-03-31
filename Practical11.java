package Practicals;

import java.util.*;

public class Practical11 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int a = sc.nextInt();
		
		if(a%4 == 0)
		{
			System.out.print("It's a leap year");
		}
		else
		{
			System.out.print("It's not a leap year");
		}
		
		
	}

}
