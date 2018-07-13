package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void before() {
		driver.get("https://www.amazon.com");
	}

	@Test
	public void searchForIphone() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
		driver.manage().window().fullscreen();
		List<WebElement> results = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li//h2"));

		for (WebElement result : results) {
			System.out.println(result.getText());
			boolean check = result.getText().contains("iphone");
			Assert.assertTrue(check);
		}
	}
	
	@AfterClass
	public void after() {
		driver.quit();
	}
	
	
}

