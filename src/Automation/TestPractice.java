package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()=\"MX Player\"]"));
		a.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).perform();
	
		String w1=driver.getWindowHandle();
	    Set<String> list= driver.getWindowHandles();
	    
	    for(String s:list) {
	    	if(!w1.equals(s)) {
	    		driver.switchTo().window(s);
	    		break;
	    	}
	    }
	}

}
