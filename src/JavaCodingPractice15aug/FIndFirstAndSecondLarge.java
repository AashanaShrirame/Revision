package JavaCodingPractice15aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FIndFirstAndSecondLarge {

	@Test(enabled = false)
	public void uploadFile() {
		int[] arr = {10, 20, 5, 90,30, 15,100};
		
		int max1=0;
		int max2=0;
		for(int i:arr) {
			
			if(i>max1) {
				max2=max1;
				max1=i;
				
			}else if(i>max2) {
				max2=i;
				
			}
		}
		
		System.out.println("max 1 "+max1);
		System.out.println("max 2 "+max2);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		List<WebElement> list=driver.findElements(By.xpath("a"));
		System.out.println(list);
	}
}
