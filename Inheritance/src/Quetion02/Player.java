package Quetion02;

import java.util.Scanner;

public class Player {
	int jersey_no;
	String TeamName;
	int  NoOfPlayes ;
	String CoachName ;
	String CaptainName ;
	Scanner scanner =new Scanner(System.in);
	
	void team () {
	System.out.println("Enter the Team Name :");	
	 TeamName = scanner.next();
	System.out.println("Enter the No of Players :");
	 NoOfPlayes = scanner.nextInt();
	System.out.println("Enter coach Name :");
	 CoachName= scanner.next();
	 System.out.println("Enter the Captain Name :");
	 CaptainName =scanner.next();
	
	}
	
	void display() {
		System.out.println("Team Name :"+TeamName);
		System.out.println("No of Playes :"+NoOfPlayes);
		System.out.println("Coach Name :"+CoachName);
		System.out.println("Captain Name :"+CaptainName);
	}
}
