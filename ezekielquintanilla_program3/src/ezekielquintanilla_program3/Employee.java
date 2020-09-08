package ezekielquintanilla_program3;

//***************************************************************
//
//Developer:         Ezekiel Quintanilla
//
//Program #:         Program3
//
//File Name:         Employee.java
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

public class Employee {
	
	// Private Attributes
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// Default Constructor
	public Employee() {
		firstName = "";
		lastName = "";
		monthlySalary = 0;
	}
	
	// Constructor
	public Employee(String string1, String string2, double salary) {
		this.firstName = string1;
		this.lastName = string2;
		
		// Negative Monthly Salary is not set
		if (salary < 0) {
			this.monthlySalary = 0;
		} else {
			this.monthlySalary = salary;
		}
	}
	
	/////////////
	// GETTERS //
	/////////////
	public String getFirstName() {
		return firstName;
	} // End getFirstName
	
	public String getLastName() {
		return lastName;
	} // End getLastName
	
	public double getMonthlySalary() {
		return monthlySalary;
	} // End getMonthlySalary
	
	/////////////
	// SETTERS //
	/////////////
	public void setFirstName(String name) {
		this.firstName = name;
	} // End setFirstName
	
	public void setLastName(String name) {
		this.lastName = name;
	} // End setLastName
	
	public void setMonthlySalary(double salary) {
		this.monthlySalary = salary;
	} // End setMonthlySalary
	
}
