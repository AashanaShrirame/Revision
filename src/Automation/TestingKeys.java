package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingKeys {

	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
       Actions a= new Actions(driver);
     //  Thread.sleep(10000);
	//  WebElement sell=driver.findElement(By.xpath("//a[text()='Sell']"));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sell']")));
       a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Sell']"))).keyUp(Keys.CONTROL).perform();
       
   
       driver.switchTo().newWindow(WindowType.TAB);
	}
}
