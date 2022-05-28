package QuetionNO_01;

import java.util.Scanner;

public class EmployeeDemo {

	Scanner scanner =new Scanner(System.in);
	
	protected int  emp_id = scanner.nextInt();
	public String emp_name=scanner.next();
	private  int emp_salary=scanner.nextInt();
	String emp_dept=scanner.next();
	
	
	void doDefault() {
		System.out.println("default Method ");
		System.out.println("protected employee id :"+emp_id);
		System.out.println("public employee name :"+emp_name);
		System.out.println("private employee salary : "+emp_salary);
		System.out.println("default emplyee department :"+emp_dept);
		System.out.println("____________________________________");
	}
	
	
	public void doPublic() {
		System.out.println( "pulic method :");
		System.out.println("protected employee id :"+emp_id);
		System.out.println("public employee name :"+emp_name);
		System.out.println("private employee salary : "+emp_salary);
		System.out.println("default emplyee department :"+emp_dept);
		System.out.println("____________________________________");
	}
	

	
	protected void doProtected() {
		System.out.println("Protected method :");
		System.out.println("protected employee id :"+emp_id);
		System.out.println("public employee name :"+emp_name);
		System.out.println("private employee salary : "+emp_salary);
		System.out.println("default emplyee department :"+emp_dept);
		System.out.println("____________________________________");
		
	}
	
	private void doPrivate() {
		System.out.println("Private method :");
		System.out.println("protected employee id :"+emp_id);
		System.out.println("public employee name :"+emp_name);
		System.out.println("private employee salary : "+emp_salary);
		System.out.println("default emplyee department :"+emp_dept);
		System.out.println("____________________________________");
		
	}
			
	
	public static void main(String[] args) {
		
		EmployeeDemo employeeDemo = new EmployeeDemo();
		employeeDemo.doDefault();
		employeeDemo.doPrivate();
		employeeDemo.doProtected();
		employeeDemo.doPublic();
	
	}

}
