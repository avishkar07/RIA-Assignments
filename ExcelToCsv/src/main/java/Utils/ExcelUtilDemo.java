package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilDemo {
	
	public static void main(String[] args) {
		ExcelUtilDemo excelUtil =new ExcelUtilDemo();
		excelUtil.getRowcount();
	}
	
	
	public static void getCellData() throws IOException {
		String ExcelPath = "C:\\Users\\AvishkarMulik\\eclipse-workspace\\ExcelToCsv\\data\\Hours_Data.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(ExcelPath);
	
		XSSFSheet sheet = workbook.getSheet("Input");
	}
	
	public  void getRowcount() {
//		String ExcelPath = "C:\\Users\\AvishkarMulik\\Desktop\\Hours_Data.xlsx";
		String ExcelPath = "C:\\Users\\AvishkarMulik\\eclipse-workspace\\ExcelToCsv\\data\\Hours_Data.xlsx";
			XSSFWorkbook workbook;
			try {
				workbook = new XSSFWorkbook(ExcelPath);
		
			XSSFSheet sheet = workbook.getSheet("Input");
			int row = sheet.getLastRowNum();
			System.out.println("No of row count :"+row);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
