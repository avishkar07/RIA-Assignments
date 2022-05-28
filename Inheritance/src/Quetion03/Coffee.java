package Quetion03;

import java.util.Scanner;

public class Coffee extends Beverages {
float coffeepowder;
Scanner scanner =new Scanner(System.in);
	@Override
	void getinfo() {
		// TODO Auto-generated method stub
		super.getinfo();
	}

	@Override
	void ingredients() {
		// TODO Auto-generated method stub
		super.ingredients();
		
	}

	@Override
	void powder() {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the Quantity of Coffee :");
		coffeepowder =scanner.nextFloat();
		System.out.println("coffee Powder :"+coffeepowder);
	}


	

}
