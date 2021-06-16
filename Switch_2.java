package Week2Lab;

// displaying the four operation and ask the user to choose the any one operator to show the output......
import java.util.Scanner;

public class Switch_2
{
   public static void main(String[] args)
   {
	  Scanner in = new Scanner(System.in);
	  System.out.println(" CHOOSE ONE OF THE OPTION GIVEN BELOW ");
	  System.out.println("1. ADDITION ");
	  System.out.println("2. SUBRACTION");
	  System.out.println("3. MULTIPLICATION ");
	  System.out.println("4. DIVISION");
	  int operation = in.nextInt();
	  
	  System.out.println("enter the number1 value : ");
	  Scanner ad = new Scanner (System.in);
	  int Numb1 = ad.nextInt();
	  
	  System.out.println("enter the number2 value : ");
	  Scanner vd = new Scanner (System.in);
	  int Numb2 = ad.nextInt();
	  
	  switch (operation)
	  {
	  case 1:
		  System.out.println("You have choosen the addition operation ");
		  int addition = Numb1 + Numb2;
		  System.out.println(" Addition of twon numbers = " + addition);
		  break;
		  
	  case 2:
		  System.out.println("you have choosen the subraction operation ");
		  int subraction = Numb1 - Numb2;
		  System.out.println("subraction of two numbers = " + subraction);
		  break;
		  
	  case 3:
		  System.out.println("you have choosen the multiplication operation ");
		  int multiplication = Numb1 * Numb2;
		  System.out.println("multiplication of two numbers = " + multiplication);
		  break;
		  
	  case 4: 
		  System.out.println("you have choosen the division operation ");
		  float division =  Numb1 / Numb2;
		  System.out.println("division of two numbers = " + division);
		  break;
		  
		  default :
			  System.out.println("choose the crt option");
		  
		  
		  
		  
	  }
	
   }	
}
