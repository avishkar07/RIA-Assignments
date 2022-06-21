package EMS;

import java.util.Scanner;

public class Salary {
	double gs;
	double it;
	double pt;
	double pf;
	double netSalary;
	void empsalary() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter Gross salary");
		gs = scanner.nextDouble();
		System.out.println("enter Income Tax %");
		it = scanner.nextDouble();
		System.out.println("enter Professional Tax %");
		pt = scanner.nextDouble();
		System.out.println("enter Provident Fund %");
		pf = scanner.nextDouble();

		pf = pf * (gs / 100);
		it = it * (gs / 100);
		pt = pt * (gs / 100);
		 netSalary = gs - it - pt - pf;
		System.out.println("Net Salary is=" + netSalary);

	}

	void displaysalary() {

		System.out.println("Gross Salary :" + gs);
		System.out.println("Income Tax : "+ it);
		System.out.println("Professional Tax :"+pt);
		System.out.println("Provident Fund :"+pf);
		System.out.println("Net Salary is "+netSalary);

	}
}
