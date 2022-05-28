package QuetionNo01;

import java.util.Scanner;

@FunctionalInterface
interface drawable{

	int isodd ();

}
@FunctionalInterface
interface drawable1{
	int isprime();
}

@FunctionalInterface
interface drawable2{
	int isPalindrome();
}



public class LabdaFunction {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number :");
	int num = scanner.nextInt();
	
	drawable d2 =()->{
		if(num%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("Odd number");
		}
		return num;
	};
	d2.isodd();
	
	drawable1 d1 =()->{
		for(int i =2 ;i<num;i++) {
			if(num % i!=0) {
				System.out.println("Prime Number");
				break;
			}else {
				System.out.println("Not Prime Number");
				break;
			}
		}
		return num ;
	};
	d1.isprime();
	
	
	drawable2 d =()->{
		int a = num;
		int sum = 0;
		while (a > 0) {
			int b = a % 10;
			sum = (sum * 10) + b;
			a = a / 10;
		}

		if (sum == num) {
			System.out.println("Number is Palindrome Number :" + num);
		} else {
			System.out.println("Number is Not Palindrome Number :" + num);
		}
		
		
		return num;
		
	};
	d.isPalindrome();
	
}

}

