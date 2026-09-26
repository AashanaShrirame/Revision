package happy_automation_15Aug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class draganddrop {
	
	@Test
	public void test1() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");

	driver.manage().window().maximize();


	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='draggable']")));

	
	Actions ac = new Actions(driver);
	WebElement s=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement t=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	Thread.sleep(10000);
	//ac.dragAndDrop(s,t).perform();

	ac.clickAndHold(s).moveToElement(t).release().build().perform();
	}

}
