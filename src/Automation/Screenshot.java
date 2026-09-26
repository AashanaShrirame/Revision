package Automation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

   @Test
   public void test1() throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:\\goggle.com");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File f= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("screen26sep.png"));
		
	
		
	}
}
