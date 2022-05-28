package QuetionNo02;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String args[]) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Array Values");
		for(int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending Sort");
		for (int k = 0; k < arr.length; k++) {
			
			System.out.println(arr[k]);
		}
	}

}
