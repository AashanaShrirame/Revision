package AXAGlobal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomationTesting {

	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@Test(priority = 1, enabled=false)
	public void launchUrl() {
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label='Amazon.in']")));
	}
	
	@Test(priority = 1)
	public void copyPaste() throws InterruptedException {
		
		  // Open DemoQA Text Box page
        driver.get("https://demoqa.com/text-box");

        // Locate Current Address field
        WebElement source = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("currentAddress")));

        // Locate Permanent Address field
        WebElement target = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("permanentAddress")));

        Actions actions = new Actions(driver);

        // Enter text in source field
        actions.click(source)
               .sendKeys("Pune, Maharashtra, India")
               .perform();

        // Select all text - CTRL + A
        actions.click(source)
               .keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys.CONTROL)
               .perform();

        // Copy - CTRL + C
        actions.keyDown(Keys.CONTROL)
               .sendKeys("c")
               .keyUp(Keys.CONTROL)
               .perform();

        // Click target field and paste - CTRL + V
        actions.click(target)
               .keyDown(Keys.CONTROL)
               .sendKeys("v")
               .keyUp(Keys.CONTROL)
               .perform();

        // Verify
        String sourceText = source.getAttribute("value");
        String targetText = target.getAttribute("value");

        System.out.println("Source Text : " + sourceText);
        System.out.println("Target Text : " + targetText);

      //  driver.quit();
	}
}
