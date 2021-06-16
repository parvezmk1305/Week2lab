package Week2Lab;

public class Employee
{ 
	int empId;
	String empName;
	Employee(int id, String name)
	{
		this.empId = id;
		this .empName = name;
		
	}
	
	void info()
	{
		System.out.println("Id : " + empId +"\t" + "Name : " + empName);
		
	}
	
	public static void main(String[] args)
	{
	Employee obj1 = new Employee(10234 , "sathya");
	Employee obj2 = new Employee(1324 , "surya");
	obj1.info();
	obj2.info();
	
	}
	

}
