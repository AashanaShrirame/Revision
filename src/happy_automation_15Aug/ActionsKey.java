package happy_automation_15Aug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionsKey {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));

		Actions actions = new Actions(driver);

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sell']")));
	       actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Sell']"))).keyUp(Keys.CONTROL).perform();
	       
	       String parentWindow=driver.getWindowHandle();
	   //    actions.keyDown(Keys.CONTROL).keyDown(Keys.TAB).perform();
	       Robot robot=new Robot();
	       
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_TAB);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyRelease(KeyEvent.VK_TAB);
	       
	    //   actions.contextClick().perform();
	       
	       
	       for(String window:driver.getWindowHandles()) {
	    	   if(!(window.equals(parentWindow))) {     // !false = true
	    		   driver.switchTo().window(window);
	    		   break;
	    	   }
	       }
	       
	       actions.doubleClick(driver.findElement(By.xpath("(//*[.=\"Prime Video\"])[2]"))).perform();
	      
	}

}
