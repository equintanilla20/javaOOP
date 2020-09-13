package ezekielquintanilla_program2;
import java.text.DecimalFormat;

//***************************************************************
//
//Developer:         Ezekiel Quintanilla
//
//Program #:         Program2
//
//File Name:         Program2.java
//
//Course:            ITSE 2321 Object-Oriented Programming - Java 
//
//Due Date:          9/14/2020
//
//Instructor:        Prof. Fred Kumi 
//
//Chapter:           2
//
//Description:
//This program displays the amount charges for a meal.
//
//***************************************************************

public class Program2 {
	
	// Main Function
	public static void main(String[] args) {
		
		// Declare Variables
		double meal = 44.50;
		double taxRate = 0.0825;
		double tipRate = 0.15;
		
		developerInfo();
		
		// Call function to display charges
		displayBill(meal, taxRate, tipRate);
		
	} // End Main Function
	
	public static void displayBill (double meal, double taxRate, double tipRate) {
		// Format doubles with two decimal places
		DecimalFormat df = new DecimalFormat("00.00");
		
		// Calculate Charges
		double taxAmount = meal * taxRate;
		double tipAmount = (meal + taxAmount) * tipRate;
		double totalCharge = meal + taxAmount + tipAmount;
		
		// Print Bill
		System.out.printf("RECEIPT");
		System.out.printf("\n===================");
		System.out.printf("\nMeal Amount: $" + df.format(meal));
		System.out.printf("\nTax  Amount: $" + df.format(taxAmount));
		System.out.printf("\nTip  Amount: $" + df.format(tipAmount));
		System.out.printf("\n===================");
		System.out.printf("\n      TOTAL: $" + df.format(totalCharge));
	} // End displayBill
	
	public static void developerInfo()
	  {
	     System.out.println("Name:    Ezekiel Quintanilla");
	     System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
	     System.out.println("Program: Two \n");

	  } // End of developerInfo
	
} // End Program 2