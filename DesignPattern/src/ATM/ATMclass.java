package ATM;

import java.util.Scanner;

public class ATMclass implements ATMInterface {
	int Balence = 10000;
	static Scanner scanner = new Scanner(System.in);

	public void home() {
		ATMclass atMclass = new ATMclass();
		System.out.println("Welcome !");
		int n = 0;
		while (n == 0) {
			System.out.println("-----------------------------------------");
			System.out.println();
			System.out.println("Enter the choose :");
			System.out.println("1 for Balence ");
			System.out.println("2 for Deposite");
			System.out.println("3 for Withdrawal");
			System.out.println("4 for Exit !");
			int key = scanner.nextInt();

			switch (key) {
			case 1: {
				System.out.println("Balence");
				atMclass.balence();
				System.out.println("-----------------------------------------");
				break;
			}
			case 2: {
				System.out.println("Deposite ");
				atMclass.deposite();
				System.out.println("-----------------------------------------");
				break;
			}
			case 3: {
				System.out.println("Withdrawal");
				atMclass.withdrawal();
				System.out.println("-----------------------------------------");
				break;
			}
			case 4: {
				System.out.println("Exit!");
				n++;
				System.out.println("-----------------------------------------");
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}
	}

	@Override
	public void balence() {
		System.out.println("Current Balence is " + Balence);
	}

	@Override
	public void deposite() {
		System.out.println("Enter the Deposite Amount :");
		int DepositeAmount = scanner.nextInt();
		Balence = Balence + DepositeAmount;
		System.out.println("Amount Deposited !");

	}

	@Override
	public void withdrawal() {
		System.out.println("Enter the Withdrawal Amount :");
		int WithdrawalAmount = scanner.nextInt();

		if (WithdrawalAmount >= Balence) {
			System.out.println("Current Balence is lower than Withrawal Amount !");
		} else {
			Balence = Balence - WithdrawalAmount;
			System.out.println("Amount Withdrawaled !");

		}
	}

}
