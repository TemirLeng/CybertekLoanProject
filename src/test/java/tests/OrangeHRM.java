package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@BeforeMethod
	public void bMethod() {
		driver.get("http://opensource.demo.orangehrmlive.com");
	}
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();				
	}
	
	@Test
	public void titleVerification() {
		String expectedTitle = "Orange";
		System.out.println("Title: " + driver.getTitle());
//		String s = "hi";
//		s.equals("hello");
//		Assert.assertEquals(expectedTitle, driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expectedTitle , "Orange title verification failed: ");
		System.out.println("Title verification is done here");
	}
	
	@Test
	public void loginTest() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		password.sendKeys("admin");
		loginBtn.click();
		String expectedUrl = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
		Assert.assertTrue(expectedUrl.equals(driver.getCurrentUrl()));
	}
	
	@AfterClass
	public void closing() {
		driver.quit();
	}
	
}
