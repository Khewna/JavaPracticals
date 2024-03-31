package Practicals;

public class Practical26 {
	public static void main(String args[])
	{
		int [] a = new int[5];
		try
		{
			a[10] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception occurred: " +e.getMessage());
			
		}
	}

}
