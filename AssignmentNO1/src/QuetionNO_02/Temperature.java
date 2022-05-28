package QuetionNO_02;

import java.util.Scanner;

public class Temperature {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number ");
		System.out.println("1 for Celsius to Fahrenheit");
		System.out.println("2 for Fahrenheit to Celsius");
		int num = scanner.nextInt();
		
		switch(num) {
		
		case 1 :System.out.println("Enter  the Temperature in celsius :"); 
				double celsius = scanner.nextDouble();
				double tempf;
				System.out.println("Temperature in celsius :"+ celsius+"°C ");
				tempf =(celsius*1.8)+32;
				System.out.println("Temperature in Fahrenheit " +tempf);
		
		case 2 :System.out.println("Enter  the Temperature in Fahrenheit :");
				double Fahrenheit =scanner.nextDouble();
				double tempc ;
				System.out.println("Temperature in Fahrenheit :"+ Fahrenheit+"°F ");
				tempc=(Fahrenheit-32)*5/9;
				System.out.println("Temperature in Celsius " +tempc);
		}
	}

}
