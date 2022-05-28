package QuetionNo04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("output.text");
		Scanner sc = new Scanner(file);
		ArrayList<String> al = new ArrayList<>();
		try {
//
// while (sc.hasNextLine())
// System.out.println(sc.nextLine());
			al.add(sc.nextLine());
			System.out.println(al);

			FileWriter fw = new FileWriter(file);
			BufferedWriter bf = new BufferedWriter(fw);
			for (String s2 : al) {
				String lowerCase = s2.toLowerCase();
				System.out.println(lowerCase);
				bf.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
sc.close();
	}
}