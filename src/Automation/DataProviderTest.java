package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderTest {

	WebDriver driver;
	@Parameters("browser")
	@Test
	public void test(String browser) {

		if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}else if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.amazon.in");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(true,true);
		sa.assertAll();

	
	}
	
//	@Test
//	public void test1() {
//		driver=new EdgeDriver();
//		driver.get("");
//	}

}
