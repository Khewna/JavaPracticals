package Practicals;

public class Practical27 {
	public static class AgeException extends Exception
	{
		public AgeException(String message)
		{
			super(message);
		}
	}
	
	public static void validateAge(int age) throws AgeException
	{
		if (age < 18)
		{
			throw new AgeException("Person is not eligible. Minimum age is 18.");
		}
		System.out.println("Person is eligible to proceed.");
	}
	public static void main(String args[])
	{
		System.out.println("Let's check for AGE: 15");
		try
		{
			validateAge(15);
		}
		catch(AgeException e)
		{
			System.out.println("Error: " +e.getMessage());
		}
		System.out.println();
		System.out.println("Let's check for AGE: 25");
		try
		{
			validateAge(25);
		}
		catch(AgeException e)
		{
			System.out.println("Error: " +e.getMessage());
		}
	}

}
