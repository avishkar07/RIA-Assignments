package QuetionNO_09;

public class Employee {



	public int emp_id;
	public String emp_name;
	public double emp_salary;
	
	public Employee(int emp_id, String emp_name, double emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public Employee() {
		
	}

	public void salary() {
		System.out.println("Employee Salary :"+emp_salary);
		
	}
	
	public void empData() {
		System.out.println(emp_id+","+emp_name);
	}
	
	public static void main(String[] args) {
		Employee employee= new Employee();
		Employee employee2=new Employee(1,"abc",50000);
		employee.empData();
		employee2.empData();
		employee.salary();
		employee2.salary();
	}
}
