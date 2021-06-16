package Week2Lab;

public class MethodOverloading
{
	 int add(int num1 ,int  num2)
	 {
		 return num1 + num2;
		 
	 }
	 
	 int add(int num1, int num2, int num3)
	 {
		 return num1+num2+num3;
	 }

	 int add(int num1 , int num2 , int num3, int num4)
	 {
		 return num1+num2+num3+num4;
		 
	 }
	 
	 public static void main(String[] args)
	 {
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Sum of Two numbers : " + obj.add(12, 34));
		System.out.println("Sum of Three numbers : " + obj.add(23, 21, 45));
		System.out.println("Sum of four numbers : " + obj.add(12, 43, 03, 23));
	 }
}

