package Practicals;

import java.util.Scanner;

public class Practical14 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms:");
		int a = sc.nextInt();
		
		
		for( int i=1;i<=a;i++)
		{
			for( int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.print("\n");
		}
	}

}
