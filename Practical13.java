package Practicals;

import java.util.*;

public class Practical13 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input value:");
		int a = sc.nextInt();
		
		
		for( int i=1;i<11;i++)
		{
			System.out.print("\n" +a +"*" +i +"=");
			System.out.print(a*i);
		}
		
	}

}
