package Practicals;

import java.util.Scanner;

class Student1
{
	int studentID;
	String studentName;
	double marks1, marks2, marks3;
	
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID of the Student: ");
		studentID = sc.nextInt();
		
		System.out.println("Enter Name of the Student: ");
		studentName = sc.next();
		
		System.out.println("Enter Marks for Subject 1: ");
		marks1 = sc.nextDouble();		
		
		System.out.println("Enter Marks for Subject 2: ");
		marks2 = sc.nextDouble();
		
		System.out.println("Enter Marks for Subject 3: ");
		marks3 = sc.nextDouble();
		
		sc.close();
	}
	void displayData()
	{
		System.out.println("Student ID: " +studentID);
		System.out.println("Studeent Name: " +studentName);
		System.out.println("Marks for Subject 1: " +marks1);
		System.out.println("Marks for Subject 2: " +marks2);
		System.out.println("Marks for Subject 3: " +marks3);
	}
	double calculateAverageMarks()
	{
		return (marks1 + marks2 + marks3)/3;
	}
}



public class Practical17 {

	public static void main(String[] args) {
		Student1 x = new Student1();
		x.setData();
		System.out.println("\nStudent details: \n");
		x.displayData();
		System.out.println("\nAverage Marks are: " +x.calculateAverageMarks());

	}

}
