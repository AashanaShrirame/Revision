package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExcelData {

	public static void main(String [] args) throws IOException {
		
//		WebDriver driver= new ChromeDriver();
//		
//		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Hp\\\\Downloads\\\\Book1.xlsx");
//		
//	    XSSFWorkbook book= new XSSFWorkbook(file);
//	    
//	   XSSFSheet sheet= book.getSheet("sheet1");
//	   
//	   System.out.println(sheet.getLastRowNum());
//	   System.out.println(sheet.getRow(1).getLastCellNum());
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\Book2.xlsx");
	//	FileOutputStream file = new FileOutputStream("C:\\Users\\Hp\\Downloads\\Book1.xlsx");

		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("aashu");
		
	    sheet.createRow(0).createCell(0).setCellValue("Aashana");
	    sheet.createRow(1).createCell(0).setCellValue("QA");
	    
	    workbook.write(file);
	    file.close();
	    workbook.close();
	   
		
	}
}
