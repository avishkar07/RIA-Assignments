package Quetion03;

import java.util.Scanner;

public class MainMethod{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int p =scanner.nextInt();
		A a =new A(p, 85, 90);
		a.getPercentage();
		B b =new B(90, 85, 90, 95);
		b.getPercentage();
	}
}
