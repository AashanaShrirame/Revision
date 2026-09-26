package happy_automation_15Aug;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestingdataExcel {

	public static void main(String[] args) throws IOException {


		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"//book1.xlsx");
		
		XSSFWorkbook book= new XSSFWorkbook(f);
		XSSFSheet sheet=book.getSheet("sheet1");
		XSSFRow row=sheet.getRow(0);
		System.out.println(row.getCell(0));
		
		FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"//book2.xlsx");
		XSSFWorkbook book1=new XSSFWorkbook();
		XSSFSheet sheet1=book1.createSheet("sheet2");
		XSSFRow row1=sheet1.createRow(0);
		row1.createCell(0).setCellValue("aashana");
		book1.write(fo);
		book1.close();
		fo.close();
		
		

	}

}
