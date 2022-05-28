package Quetion01;

import java.util.Scanner;

public class Dogtest extends Dog{


public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	Dog dog =new Dog();
	Yorkshire yorkshire = new Yorkshire();
	Labrador labrador = new Labrador();
	System.out.println("1=Yorkshire");
	System.out.println("2=Labrador");
	System.out.println("Enter the Number :");
	int num =scanner.nextInt();

	switch (num) {
	case 1: {
			yorkshire.getinfo();
			yorkshire.display();
		break;
	}
	case 2:{
		labrador.getinfo();
		labrador.display();
		break;
	}
	}
}
}
