package QuetionNO02;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		try {
			FileInputStream file_data =null;
			 file_data = new FileInputStream("Hello.txt");
			 
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("In Try-catch block CheckedException");
			System.out.println(e);
			
		}
	}
}