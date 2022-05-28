package QuetionNO_08;

import java.util.Scanner;

public class Test {
	
	public static int num ;
	public Test(int num) {
		this.num = num;
	}
	
	public void evenOdd() {
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
	
	public void Factorial () {
		int fact =1;
		int i=1;
		do {
			fact=fact* i;
			i++;
		} while (num>=i);
		System.out.println("Factorial is :"+fact);
		}
	
	public void sumOfNum() {
		int sum =0;
		for (int i = 1; i <=num; i++) {
			sum =sum +i;
		}
		System.out.println("Sum Of all digits :"+sum);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = scanner.nextInt();
		Test test=new Test(num);
		test.evenOdd();
		test.Factorial();
		test.sumOfNum();
		
	}
}
