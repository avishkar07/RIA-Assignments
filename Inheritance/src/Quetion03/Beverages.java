package Quetion03;

import java.util.Scanner;

public class Beverages {

	float water;
	float milk;
	float sugar;
	float powder ;

	Scanner scanner = new Scanner(System.in);

	void getinfo() {
		System.out.println("Enter the Water Quantity :");
		water = scanner.nextFloat();
		System.out.println("Enter the milk Quantity :");
		milk = scanner.nextFloat();
		System.out.println("Enter the Sugar :");
		sugar=scanner.nextFloat();

	}
	void ingredients() {
		System.out.println("water :"+water);
		System.out.println("sugar :"+sugar);
		System.out.println("milk :"+milk);
		
	}
	void powder() {
		System.out.println("Enter the Quantity of powder :");
		powder =scanner.nextFloat();
		System.out.println(" Powder :"+powder);
	}

}
