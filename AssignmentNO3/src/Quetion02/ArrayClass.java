package Quetion02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {

//	        int a[] = { 1, 2, 3, 4, 5 };
	        int [] array= new int[5];
	  Scanner scanner =new Scanner(System.in);
	  
	        try {
	        	for (int i = 0; i < array.length; i++) {
					array[i]=scanner.nextInt();
				
				}
	        	array[6]=12;
//	            int x ;
//	            x=Array.getByte(a, 6);
//	            System.out.println(x);
	        }
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index OutOf Bound Exception : " + e);
	        }
	    }
	
	}
	

