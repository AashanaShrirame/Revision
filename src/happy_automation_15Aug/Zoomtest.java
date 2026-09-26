package happy_automation_15Aug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Zoomtest {

	@Test
	public void test1zoom() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));

		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='150%'");
		
//		Actions action=new Actions(driver);
//		
//		action.keyDown(Keys.CONTROL).sendKeys(Keys.ADD).keyUp(Keys.CONTROL).perform();
//		
//		  Robot robot = new Robot();
//          
//          // Press Ctrl + Plus (+)
//          robot.keyPress(KeyEvent.VK_CONTROL);
//          robot.keyPress(KeyEvent.VK_ADD);
//          
//          // Always release keys in reverse order
//          robot.keyRelease(KeyEvent.VK_ADD);
//          robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}
