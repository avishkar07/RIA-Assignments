package QuetionNo06;

import java.util.Scanner;

public  class Dept {
 public static int   did ;
 public static String dname;
 


	static void depinfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter department  Id :");
		did=scanner.nextInt();
		System.out.println("Enter the department Name :");
		dname=scanner.next();
	}
	static void displaydept() {
		System.out.println("Employee Id :"+did);
		System.out.println("Employee Name :"+dname);
	}
}

class MyDate  {
	 
	public static  int day ;
	public static int month;
	public static int year ;

	static void getdate() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the day :");
		day=scanner.nextInt();
		System.out.println("Enter the Month :");
		month=scanner.nextInt();
		System.out.println("Enter the Year :");
		year=scanner.nextInt();
		
	}
	static void displaydate()
	{
		
		System.out.println("Day :"+day);
		System.out.println("Month :"+month);
		System.out.println("Year :"+year);
	}
	
	
}
class Employee {

	public static int  emp_id;
	public static String emp_name;
	public static int salary;
	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in); 
		
		Dept dept = new Dept();
		MyDate myDate = new MyDate();
		
		System.out.println("Enter the NOs Of employee:");
		int capacity = scanner.nextInt();
		Employee [] employee1 = new Employee[capacity];
		for (int i = 0; i < employee1.length; i++) {
			System.out.println("Enter the employee id :");
			employee1[i].emp_id= scanner.nextInt();
			System.out.println("Enter the Employe Name :");
			employee1[i].emp_name=scanner.next();
			System.out.println("Enter the employee salary :");
			employee1[i].salary= scanner.nextInt();
		
			
			dept.depinfo();
			myDate.getdate();
			System.out.println("___________________");
			
		
		}
		for (Employee employee2 : employee1) {
			System.out.println(employee2);
		}
	}
}
