package Week2Lab;

public class EvenNumbers {
  
       public static void main(String[] args) {
		
		int number = 30;		
		System.out.println("List of numbers from 1 to" +number+":");
		for (int i=0;i <= number;i++)
		{
			if (i%2==0)
			{
				System.out.println(i +" ");
			}
		}
	}
}