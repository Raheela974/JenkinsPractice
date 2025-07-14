package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	@Test
	public void testMethod() {
		//test comment
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/locatorspractice/");
		driver.quit();
	}

}

