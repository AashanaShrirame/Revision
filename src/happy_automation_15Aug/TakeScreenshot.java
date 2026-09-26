package happy_automation_15Aug;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("test.png"));
		
	  
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	driver.quit();		
		
		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	//	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[.=\"Amazon LIVE - Watch, Chat & Shop LIVE \"]")));
	

	}

}
