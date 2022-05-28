package QuetionNO02;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionThrows {

	public static void main(String[] args)throws IOException {
		
		FileInputStream file_data =null;
		 file_data = new FileInputStream("Hello.txt");
		 
		 int  ch ;
		 
		 while((ch=file_data.read())!=-1) {
			 System.out.println(ch);
		 }
		 file_data.close();
	}
}
