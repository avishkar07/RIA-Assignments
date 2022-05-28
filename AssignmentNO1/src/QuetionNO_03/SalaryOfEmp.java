package QuetionNO_03;

import java.util.Scanner;

public class SalaryOfEmp {

	int emp_id ;
	float emp_exp;
	float emp_salary;
	float salary ,temp;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void getinto () {
		System.out.println("Enter Employee ID :");
		 emp_id =scanner.nextInt();
		System.out.println("Enter Employee Salary :");
		 emp_salary =scanner.nextFloat();
		System.out.println("Enter Employee Experience :");
		 emp_exp =scanner.nextFloat();
	}
	
	public void display() {
		System.out.println("Id :"+emp_id);
		System.out.println("Experience :"+ emp_exp);
	
	}
	
	public void salary() {
		if(emp_exp >=3) {
			temp = (emp_salary*20)/100;
			salary = emp_salary + temp ;
			System.out.println("Salary of Employee on there service :"+salary);
			
		}
		else {
			
			System.out.println("Salary of Employee on there service :" +emp_salary);
		}
	}

	public static void main(String[] args) {
		
		SalaryOfEmp salaryOfEmp = new SalaryOfEmp();
		salaryOfEmp.getinto();
		salaryOfEmp.display();
		salaryOfEmp.salary();
		
	}
}
