package Week2Lab;

import java.util.Scanner;

public class Months
{ 
	public static void main(String[] args)
	{
		//int month = 8;
		System.out.println("ENTER THE MONTH YOU WANT TO KNOW THE SEASON : ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
	    if (month<= 5)  
	   {
	    	System.out.println("THIS MONTH BELONGS TO SUMMER SEASON.....");
	    	
	   }
	    
	    else if (month<=8)
	    {
	    	System.out.println("THIS MONTH BELONGS TO SEASON WINNTER...... ");
	    }
		
	    else 
	    {
	    	 System.out.println("THIS MONTH BELONGS TO SNOW SEASON .......");
	    }
	
	}

}
