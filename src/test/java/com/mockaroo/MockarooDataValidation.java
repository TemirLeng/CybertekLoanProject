package com.mockaroo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockarooDataValidation {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@BeforeClass
	public void setup() {
		// set up chrome driver path
		WebDriverManager.chromedriver().setup();
		
		// instanciate an object of webdriver
		driver = new ChromeDriver();
		
		// set up to open fullscreen window of chrome
		driver.manage().window().fullscreen();
	}
	
	@BeforeMethod
	public void bMethod() {
		String url = "https://mockaroo.com/";
		// getting to url
		driver.get(url);
	}
	
	@Test
	public void verifyTitle() {
		// getting the actual title and comparing with expected title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Mockaroo - Random Data Generator and API Mocking Tool | JSON / CSV / SQL / Excel";
		Assert.assertEquals(actualTitle, expectedTitle, "Title is not same");
	}
	
	@Test
	public void verifyText() {
		// getting the actual brand and tagline, then comparing with the expected
//		String actualBrand = driver.findElement(By.xpath("//div[@class='brand']")).getText();
//		String actualTagline = driver.findElement(By.xpath("//div[@class='tagline']")).getText();
//		
//		String expectedBrand = "mockaroo";
//		String expectedTagline = "realistic data generator";
		
		boolean brand = driver.findElement(By.xpath("//div[@class='brand']")).isDisplayed();
		boolean tagLine = driver.findElement(By.xpath("//div[@class='tagline']")).isDisplayed();
		
		Assert.assertTrue(brand, "Brand name is not displayed");
		Assert.assertTrue(tagLine, "Tag Line is not displayed");
//		Assert.assertEquals(actualBrand, expectedBrand);
//		Assert.assertEquals(actualTagline, expectedTagline);
	}
	
	@Test
	public void removeAllField() throws InterruptedException {
		// getting each element to remove
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='close remove-field remove_nested_fields']"));
		
		// removing each element by clicking "x"
		for(int i = 0; i < elements.size(); i++) {
			elements.get(i).click();
			Thread.sleep(1000);
		}
		
		// getting each columns has the text
		boolean fieldName = driver.findElement(By.xpath("//div[@class='column column-header column-name']")).isDisplayed();
		boolean type = driver.findElement(By.xpath("//div[@class='column column-header column-type']")).isDisplayed();
		boolean options = driver.findElement(By.xpath("//div[@class='column column-header column-options']")).isDisplayed();
		
		// checking each columns has name
		Assert.assertTrue(fieldName, "Field Name - is displayed");
		Assert.assertTrue(type, "Type - is displayed");
		Assert.assertTrue(options, "Options - is displayed");
		
		// finding and checking that there is a button 'add another field' 
		boolean addAnotherField = driver.findElement(By.xpath("//a[@class='btn btn-default add-column-btn add_nested_fields']")).isEnabled();
		Assert.assertTrue(addAnotherField, "Add Another Field - is enabled");
		
		// checking that inside rows values 1000
		String rowValue = driver.findElement(By.id("num_rows")).getAttribute("value");
		Assert.assertEquals(rowValue, "1000", "Row has value of 1000");
		
		// checking that format is CSV
		String format = driver.findElement(By.id("schema_file_format")).getAttribute("value");
		Assert.assertEquals(format, "CSV", "Format is not CSV");
	}
	
	
	
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(8000);
//		driver.quit();
	}
}