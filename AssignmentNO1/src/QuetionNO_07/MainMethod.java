package QuetionNO_07;

import java.util.Scanner;

public class MainMethod extends AccountManagement{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	MainMethod mainMethod = new MainMethod();

	mainMethod.insertData();
	mainMethod.displayData();
	
	System.out.println("enter the Opertion No ");
	System.out.println("1 = Deposit Amount ");
	System.out.println("2 = Withdraw Amount");
	System.out.println("3 = Checking Amount");

	int input =scanner.nextInt();
	switch (input) {
	case 1: {
		mainMethod.depositAmount();
		break;
	}
	case 2:{
		mainMethod.withdrawAmount();
		break;
	}
	case 3 :{
		mainMethod.checkBalance();
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + input);
	}
		
	}
}
