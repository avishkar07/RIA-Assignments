package Quetion03;

import java.util.Scanner;

public class Tea extends Beverages{
	Scanner scanner =new Scanner(System.in);
 float teapowder ; 
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
		
		System.out.println("Enter the Quantity of tea :");
		teapowder =scanner.nextFloat();
		System.out.println("tea Powder :"+teapowder);
	}

}
