package project1;
import java.text.DecimalFormat;

//***************************************************************
//
//Developer:         Ezekiel Quintanilla
//
//Program #:         Program1
//
//File Name:         Program1.java
//
//Course:            ITSE 2321 Object-Oriented Programming - Java 
//
//Due Date:          9/5/2020
//
//Instructor:        Prof. Fred Kumi 
//
//Chapter:           1
//
//Description:
//   This program displays the amount of gross pay per pay
//	 period for an employee.
//***************************************************************

public class Program1
{
  //***************************************************************
  //
  //  Method:       main
  // 
  //  Description:  The main method of the program
  //
  //  Parameters:   String array
  //
  //  Returns:      N/A 
  //
  //**************************************************************
	
	public static void main(String[] args)
  {
     // declare variables here
	 DecimalFormat df = new DecimalFormat("0,000.00");
	 double amount = 32500.00;
	 
     developerInfo();
  
     // Enter more statements here
  
     System.out.println("Annual Salary           = $" + df.format(amount));
     System.out.println("When paid twice a month = $" + df.format(twiceMonthly(amount)));
     System.out.println("When paid bi-weekly     = $" + df.format(biWeekly(amount)));
  }
	
  //***************************************************************
  //
  //  Method:       developerInfo
  // 
  //  Description:  The developer information method of the program
  //
  //  Parameters:   None
  //
  //  Returns:      N/A 
  //
  //**************************************************************
	
  public static void developerInfo()
  {
     System.out.println("Name:    Ezekiel Quintanilla");
     System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
     System.out.println("Program: One \n");
     System.out.println((15 + 2) % 3 - 1);
  } // End of developerInfo
  
  //***************************************************************
  //
  //  Method:       twiceMonthly
  // 
  //  Description:  Calculates pay on twice monthly basis
  //
  //  Parameters:   amount
  //
  //  Returns:      double twiceMonthly
  //
  //**************************************************************
  
  public static double twiceMonthly(double grossPay)
  {
	  double twiceMonthlyGross = grossPay / 24;
	  return twiceMonthlyGross;
  } // End of twiceMonth
  
  //***************************************************************
  //
  //  Method:       biWeekly
  // 
  //  Description:  Calculates pay on bi-weekly basis
  //
  //  Parameters:   amount
  //
  //  Returns:      double biWeeklyGross
  //
  //**************************************************************
  public static double biWeekly(double grossPay)
  {
	  double biWeeklyGross = grossPay / 26;
	  return biWeeklyGross;
  } // End of biWeekly
}

