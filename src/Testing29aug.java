import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testing29aug {

     // Action Key
	// Broken Links
	// Take Screenshot
	// Excel
	
	@Test
	public void test1() throws WebDriverException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));
		
		Actions act=new Actions(driver);
		
		Action a=act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("(//a[text()=\"Customer Service\"])[1]"))).keyUp(Keys.CONTROL).build();
		
		a.perform();
		
//		String parentWindow=driver.getWindowHandle();
//		Set<String> list=driver.getWindowHandles();
//		for(String s:list) {
//			
//			if(!(s.equals(parentWindow))) {
//				driver.switchTo().window(s);
//				break;
//			}
//		}
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//span[contains(text(),\"Headphones from most loved\")])[1]")));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("test.png"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	
}
