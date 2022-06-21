package Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

import com.opencsv.CSVWriter;

public class CsvWrite {

	private static final String CSV_FILE_PATH = "./input.csv";

	public static void main(String[] args) {
		addDataToCSV(CSV_FILE_PATH);
	}

	public static void addDataToCSV(String output) {
		
		File file = new File(output);
		Scanner sc = new Scanner(System.in);
		try {
	
			FileWriter outputfile = new FileWriter(file);

			CSVWriter writer = new CSVWriter(outputfile, ';', CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);

			List<String[]> data = new ArrayList<String[]>();

			System.out.println("Enter no of rows");
			int noOfRow = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Data");
			for (int i = 0; i < noOfRow; i++) {
				String row = sc.nextLine();
				String[] rowdata = row.split(" ");
				data.add(rowdata);
			}
			System.out.println("successfully write");

			writer.writeAll(data);

			// closing writer connection
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
