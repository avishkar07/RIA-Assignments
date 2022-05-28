package Quetion01;

import java.security.PublicKey;
import java.util.Scanner;

public class UserRegistration {
	public String userName ;
	public static int age;
	public static String country ;
	
	public void getinfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Username :");
		userName = scanner.next();
		System.out.println("Enter the Age :");
		age= scanner.nextInt();
		System.out.println("Enter the Country :");
		country = scanner.next();	
	}
	
	public void findage(int age) throws InvalidAgeException {
		  if (age >=18) {
	            System.out.println("User is a Major");
	        } else {
	        	throw new InvalidAgeException("user is Minor ");
	}
	}
		  public void findcountry(String Country) throws InvalidCountryException {
			  if(country.equals("India")) {
				  System.out.println("User is Indian");
			  }else {
				  throw new InvalidCountryException("User is not Indian");
			  }
		  }
	
	}
