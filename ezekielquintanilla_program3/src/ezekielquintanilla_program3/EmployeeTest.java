package ezekielquintanilla_program3;
import java.text.DecimalFormat;

//***************************************************************
//
//Developer:         Ezekiel Quintanilla
//
//Program #:         Program3
//
//File Name:         EmployeeTest.java
//
//Course:            ITSE 2321 Object-Oriented Programming - Java 
//
//Due Date:          9/19/2020
//
//Instructor:        Prof. Fred Kumi 
//
//Chapter:           3
//
//Description:
//This program creates two employee objects with names
//and monthly salaries then gives them raises.
//
//***************************************************************

public class EmployeeTest {

	public static void main(String[] args) {
		// Variable for formatting salary
		DecimalFormat df = new DecimalFormat("0,000.00");
		
		// Instantiate Employee Objects
		Employee myFirstEmployee = new Employee("John", "Doe", 2875.00);
		Employee mySecondEmployee = new Employee("Jane", "Doe", 3150.75);
		double raiseRate = 0.2; 
		
		developerInfo();
		
		// Print Basic Information
		System.out.println("Employee 1 Information\nName: " + myFirstEmployee.getFirstName() + "\nLast Name: " + myFirstEmployee.getLastName() + "\nMonthly Salary: $" + df.format(myFirstEmployee.getMonthlySalary()));
		System.out.println();
		System.out.println("Employee 2 Information\nName: " + mySecondEmployee.getFirstName() + "\nLast Name: " + mySecondEmployee.getLastName() + "\nMonthly Salary: $" + df.format(mySecondEmployee.getMonthlySalary()));
		
		// Give Raises!!!
		myFirstEmployee.setMonthlySalary(myFirstEmployee.getMonthlySalary()*(1+raiseRate));
		mySecondEmployee.setMonthlySalary(mySecondEmployee.getMonthlySalary()*(1+raiseRate));
		
		// Print New Raises
		System.out.println();
		System.out.println("Employee 1 salary after raise: $" + df.format(myFirstEmployee.getMonthlySalary()));
		System.out.println("Employee 2 salary after raise: $" + df.format(mySecondEmployee.getMonthlySalary()));
	}
	
	public static void developerInfo() {
	     System.out.println("Name:    Ezekiel Quintanilla");
	     System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
	     System.out.println("Program: Three \n");

	} // End of developerInfo

}
