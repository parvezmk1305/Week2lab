package Week2Lab;

import java.util.Scanner; 

import java.text.NumberFormat;

 class Salary
{
  public static void main(String[] args)
  {
	double currentSalary; //employee's current salary 
	double raise=0; //amount of the raise 
	double newSalary; //new salary for the employee
	int rating ; //performance rating 
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter the current salary : ");
	currentSalary = scan.nextDouble();
	System.out.print("Enter the performance rating (Excellent ,Good , or poor ) : ");
	System.out.println("please select your option from given below : ");
	System.out.println("1 for Excellent .");
	System.out.println("2 for Good . ");
	System.out.println("3 for poor . ");
	rating = scan.nextInt();
	//compute the raise using if 
	if (rating >= 1)
	{
		raise = (6*100)/10;	
	}
	else if (rating >=2)
	{
		raise = (4*100)/10;
	}
	else 
	{
		raise = (1.5*100)/10;
	
	}
	newSalary = currentSalary + raise;
	//print the results
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	System.out.println();
	System.out.println("Current salary : " + money.format(currentSalary));
	System.out.println("Amount of your raise : " + money.format(raise));
	System.out.println("Your new salary : " + money.format(newSalary));
	System.out.println();
  } 
}
