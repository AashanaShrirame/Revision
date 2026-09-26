package Automation9jul;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        Thread.sleep(10000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@title=\"Search in\"]")));
		WebElement dropdown= driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		Select s = new Select(dropdown);
		List<WebElement> list= s.getOptions();
		for(WebElement item:list) {
			System.out.println(item.getText());
		}
		
	
		dropdown.click();
		driver.findElement(By.xpath("//option[text()='Alexa Skills']")).click();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("dropdownimage.png"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()=\"Amazon LIVE - Watch, Chat & Shop LIVE \"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		WebElement el2=driver.findElement(By.xpath("//*[text()=\"Watch now\"]"));
		
	//	driver.quit();
		

	}

}

