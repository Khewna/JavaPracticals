package Practicals;

import java.util.*;

class Add
{
	int add(int num1, int num2)
	{
		return num1 + num2;
	}
}

public class Practical16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Add adder = new Add();
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int sum = adder.add(num1, num2);
		System.out.println("Sum is: " +sum);
		
		sc.close();
	}

}
