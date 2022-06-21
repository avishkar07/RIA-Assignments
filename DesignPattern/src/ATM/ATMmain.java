package ATM;

import java.util.Scanner;

public class ATMmain {

	public static void main(String[] args) {
		ATMclass atMclass = new ATMclass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		System.out.println("1 For Enter the Card :");
		int a = scanner.nextInt();
		if (a == 1) {
			atMclass.home();
		} else {
			System.out.println("please enter the card !");
		}

	}
}
