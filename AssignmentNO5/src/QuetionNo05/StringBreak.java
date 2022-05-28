package QuetionNo05;

import java.util.Scanner;

public class StringBreak {

	public static void main(String[] args) {

		String Input = " He said, \"That's not a good idea.\" ";

		char[] chararray = Input.toCharArray();

		for (int i = 0; i < Input.length(); i++) {
			char ch = Input.charAt(i);
			if (Character.isLetter(ch)) {
				System.out.print(ch);
			} else {
				System.out.println();
			}
		}
	}
}
