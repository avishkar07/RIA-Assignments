package Quetion05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Payment payment = new Payment();

		Scanner scanner = new Scanner(System.in);
		System.out.println("selext the options :");
		System.out.println("1 = COD");
		System.out.println("2 = Credit Card");
		System.out.println("3 = NetBanking");
		int key = scanner.nextInt();
		switch (key) {
		case 1: {
			System.out.println("Enter the Address :");
			String Address = scanner.next();
			payment.paymentfunction(Address);
			break;
		}
		case 2: {
			System.out.println("Enter userid :");
			long UserID = scanner.nextLong();
			System.out.println("Enter the password :");
			String password = scanner.next();
			payment.paymentfunction(UserID, password);
			break;
		}
		case 3: {
			System.out.println("Enter the name :");
			String Name = scanner.next();
			System.out.println("Enter the Card Number :");
			long CardNo =scanner.nextLong();
			System.out.println("Enter the CVV ");
			int CVV = scanner.nextInt();
			System.out.println("Enter the Date :");
			int Date = scanner.nextInt();
			payment.paymentfunction(Name, CardNo, CVV, Date);
			break;
		}

		}

	}
}
