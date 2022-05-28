package Quetion01;

import java.util.Scanner;

public class Dog {

	 String name ;
	 String color;
	 String sex;
	 Double weight;
	 int Hight;
	 
void getinfo() {
	Scanner scanner = new  Scanner(System.in);
	System.out.println("Enter the Name :");
	name=scanner.next();
	System.out.println("Enter the color of dog :");
	color=scanner.next();
	System.out.println("Enter the sex of dog :");
	sex=scanner.next();
	System.out.println("Enter the weight of dog :");
	weight=scanner.nextDouble();
	System.out.println("Enter the Hight of Dog");
	Hight=scanner.nextInt();
}
void display() {
	System.out.println("Name :"+name);
	System.out.println("Color : "+color);
	System.out.println("Sex : "+sex);
	System.out.println("Weight : "+weight);
	System.out.println("Hight : "+ Hight);
}

	
}