package Practicals;

public class Practical29 implements Runnable{
	public final int number;
	public static Object lock = new Object();
	
	public Practical29(int number)
	{
		this.number = number;
	}
	
	public void run()
	{
		synchronized(lock)
		{
			try
			{
				System.out.println("Counting: " +number);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[])
	{
		for(int i =1; i<=5; i++)
		{
			Thread thread = new Thread(new Practical29(i));
			thread.start();
		}
	}

}
