package QuetionNo01;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  the Length of array :");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements in array :");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
		System.out.println("Sum of all digits :" + sum);

	}
}
