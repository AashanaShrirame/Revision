package Jul14Practice;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//*[@role=\"button\"]"));
//        Actions a=new Actions(driver);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@role=\"button\"]")));
//        a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//*[text()=\"Fashion\"]"))).keyUp(Keys.CONTROL).perform();
        
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
        Thread.sleep(10000);
    //    driver.findElement(By.xpath("//*[@role=\"button\"]"));
        Actions a=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Sell']")));
        a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Sell']"))).keyUp(Keys.CONTROL).perform();
        a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Mobiles']"))).keyUp(Keys.CONTROL).perform();

        String w1=driver.getWindowHandle();
        
        List<String> set= new ArrayList<>(driver.getWindowHandles());
        
//        for(String s:set) {
//        	if(s.equals(w1)) {
//        		driver.switchTo().window(windows.);
//        		break;
//        	}
//        }
        driver.switchTo().window(set.get(1));
	}

}
