import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
	public static void main(String[] args)  {
		
		ReadAndWrite readandwrite =new  ReadAndWrite();
		try {
			readandwrite.file();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		public void file() throws IOException {
		File fis = new File("read.txt");
		
		List<String> list = new ArrayList<String>();
		String vr = null;
		Scanner scanner=new Scanner(fis);
		while(scanner.hasNext()) {
//			System.out.println(scanner.next());
			list.add(scanner.next());
			
		}
		System.out.println("file read Successfully");
		
		Collections.sort(list);
		FileWriter fileWriter = new FileWriter("write.txt");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			fileWriter.write(list.get(i)+"\n");
		}
		System.out.println("file Write Successfully");
		fileWriter.close();
	}
	}

