package happy_automation_15Aug;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBrokenLink {

	@Test
	public void test1() throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));

		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		for(WebElement w:list) {
			
			String link=w.getAttribute("href");
			
//			if(link.isEmpty() || link==null) {
//				continue;
//			}
			
			if(link==null  || link.isEmpty()) {
				continue;
			}

			
			if(!link.startsWith("https://") && !link.startsWith("http://")) {
				continue;
			}
			
			HttpURLConnection https=(HttpURLConnection) new URL(link).openConnection();
			https.connect();
			int code=https.getResponseCode();
			
			if(code>=400) {
				System.out.println(link);
			}
			
		}
		
		
	}
}
