package QuetionNO_07;

import java.util.Scanner;

public class AccountManagement extends BankAccountManagementdemo{
	Scanner scanner = new Scanner(System.in);
	public void insertData() {
	
		System.out.println("Enter the Id :");
		Id =scanner.nextInt();
		System.out.println("Enter the Name :");
		Name=scanner.next();
		System.out.println("Enter the Account No :");
		AccountNo =scanner.nextLong();
		System.out.println("Enter the Amount :");
		Amount = scanner.nextDouble();
		System.out.println("_____________________");
	}
	public void displayData() {
	System.out.println("Id : "+ Id);
	System.out.println("Name : " +Name);
	System.out.println("Account No : "+ AccountNo);
	System.out.println("Amount :" +Amount);
	System.out.println("_____________________");
	}
	public void depositAmount() {
		double deAmount ;
		
		System.out.println("Enter the Amount to Deposite :");
		deAmount = scanner.nextDouble();
		Amount = Amount+deAmount;
		System.out.println("Total amounnt is "+Amount);
		System.out.println("_____________________");
		
	}
	public void withdrawAmount() {
		double withAmount;
		System.out.println("Enter the Amount to Withdraw :");
		withAmount= scanner.nextDouble();
		Amount = Amount-withAmount;
		System.out.println("Total amounnt is "+Amount);
		System.out.println("_____________________");
	}
	public void checkBalance() {
		long checkAccount ;
		System.out.println("Enter the account No for Checking the Balance :");
	 checkAccount = scanner.nextLong();
	 
	 if(AccountNo==checkAccount) {
		 System.out.println("Account Balence :"+Amount);
			System.out.println("_____________________");
	 }
	 else {
		 System.out.println("Invalid Account No !");
			System.out.println("_____________________");
	 }
	}
}
