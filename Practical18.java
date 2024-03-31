package Practicals;

import java.util.Scanner;

class Person
{
	String p_name;
	int p_age;
	
	Person(String p_name, int p_age)
	{
		this.p_name = p_name;
		this.p_age = p_age;
	}
	
	void Display1()
	{		
		System.out.println("The person's Name is: " +p_name);
		System.out.println("Age of " +p_name +" is: " +p_age);
		

	}
}
	
class Employee extends Person
{
	int employee_id;
	int e_salary;
	
	Employee( int employee_id, String p_name, int p_age, int e_salary)
	{
		super(p_name, p_age);
		this.employee_id = employee_id;
		this.e_salary = e_salary;
			
	}

		
	void Display2()
	{
		System.out.println("Employee ID is: " +employee_id);
		System.out.println("Employee salary is: " +e_salary);
	}

}


public class Practical18 {
	public static void main(String[] args)
	{
		Employee a = new Employee(01, "Khewna Mehta", 19, 100000);
		a.Display1();
		a.Display2();
		
	}

}
