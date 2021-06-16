package Week2Lab;

import java.util.Scanner;

public class Swapping 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the vaue of x and y ");
		Scanner scan = new Scanner(System.in);
		// define variables
		int x=scan.nextInt();
		int y = scan.nextInt();
		System.out.println("before swapping numbers : " + x+ " " + y );
		
		// swapping 
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping " + x+ " "+ y);
	}
	
}
