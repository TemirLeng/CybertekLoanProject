package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cybertek {
	
	// TestNG ---> Parralel execution
	// Verification and Assertion
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void before() {
		driver.get("https://learn.cybertekschool.com/login/canvas");
	}
	
	@Test
	public void login() {
		driver.manage().window().fullscreen();
		driver.findElement(By.name("pseudonym_session[unique_id]")).sendKeys("jamiliabedelbaeva");
		driver.findElement(By.name("pseudonym_session[password]")).sendKeys("jamiliabedelbaeva");
		driver.findElement(By.xpath("//form[@id='login_form']//button[@type='submit']")).click();
		
	}
	

}
