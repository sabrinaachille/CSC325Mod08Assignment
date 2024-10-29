/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // scanner and gpa for user input
	 Scanner sc = new Scanner(System.in);
	 float gpa;

	 // ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 	// cast second para to short to resolve conversion error
		Student std1= new Student("James", (short) 20);
                // ToDo 11: Add a toString method for the Senior class
							// changed from Student() to Freshman()
		Freshman std3 = new Freshman("James", (short)20, 12); // name, age, credits
	 						// changed from Student() to Senior()
	 	Senior std2 = new Senior("John", (short)30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 	// prompts user to enter a gpa
	 	System.out.println("Enter the gpa of the student: ");
	 	// gpa stores user input
		gpa = sc.nextFloat();
		// gpa is set to std1
		std1.setGpa(gpa);

		System.out.println(std1);

		System.out.println(std2);

		System.out.println(std3);

		// ToDo 13: add comments and explain your code

	}

}

