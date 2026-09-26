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

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label=\"Amazon.in\"]")));

		List<WebElement> lis= driver.findElements(By.tagName("a"));
		
		for(WebElement w:lis) {
			String url=w.getAttribute("href");
			if (url == null || url.isEmpty()) {
			    continue;
			}
			
			if (!url.startsWith("http://") && !url.startsWith("https://")) {
			    continue;
			}

			
			HttpURLConnection con= (HttpURLConnection) new URL(url).openConnection();
			con.connect();
			int r=con.getResponseCode();
		//	System.out.println(url + " = "+r);
			
			if(r>=400) {
				System.out.println(url);
			}
			
			
		}
		driver.quit();
	}

}
