package EMS;

import java.util.Scanner;

public class Nevonnumber {

	public static void main(String[] args) {
		int sum = 0;
		int r;
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int number = scanner.nextInt();
		for (int i =0; i <1000; i++) {
			
		int number=i;
		
		int squ = number * number;
		while (squ != 0) {

			r = squ % 10;
			sum = sum + r;
			squ = squ / 10;

		}
		if (number == sum) {

			System.out.println("the Number is Nevon Number :" + number);
		} else {
			System.out.println("the Number is not Nevon Number :" + number);
		}
		sum=0;
		}

	}
}
