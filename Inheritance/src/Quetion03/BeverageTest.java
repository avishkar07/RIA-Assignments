package Quetion03;

import java.util.Scanner;

public class BeverageTest extends Beverages{
public static void main(String[] args) {
	
	Beverages beverages = new Beverages();
	Tea tea = new Tea();
	Coffee coffee =new Coffee();
	System.out.println("select the option :");
	System.out.println("Enter  1 for Tea :");
	System.out.println("Enter 2 for Coffee :");
	
	Scanner scanner = new Scanner( System.in);
	int key = scanner.nextInt();
	
	switch (key) {
	case 1: {
		tea.getinfo();
		tea.powder();
		tea.ingredients();
		break;
	}
	case 2 :{
		coffee.getinfo();
		coffee.powder();
		coffee.ingredients();
		break;
	}
		
	}
}
}
