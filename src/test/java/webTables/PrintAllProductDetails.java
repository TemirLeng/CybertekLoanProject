package webTables;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllProductDetails {
	
	WebDriver driver;
	
	@BeforeClass
	private void setup() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	 		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void getAllProductsV1() {
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=wooden+spoon");
		List<WebElement>descriptions = driver.findElements(By.xpath("//h2"));
		for(WebElement item : descriptions) {
			System.out.println(item.getText());
		}
		List<WebElement>prices = driver.findElements(By.xpath("//span[@class='sx-price-whole']"));
		for(WebElement price : prices) {
			System.out.println(price.getText());
		}
		for(int i=0; i < descriptions.size(); i++) {
			System.out.println(descriptions.get(i).getText());
			System.out.println(prices.get(i).getText());
			System.out.println("----------------");
		}
//		(//div[@class='s-item-container'])[1]//h2
		//div[@class='s-item-container']
		List<WebElement> wholeItems = driver.findElements(By.xpath("//div[@class='s-item-container']"));
		System.out.println("wholeItems.size():" + wholeItems.size());
		
		for (WebElement item : wholeItems) {
			String d = item.findElement(By.tagName("h2")).getText();
			String p = item.findElement(By.xpath("//span[@class='sx-price sx-price-large']")).getText();
			System.out.println(d);
			System.out.println(p);
			System.out.println("----------------");
			
		}
	
	}
	
	@AfterClass
	private void tearDown() {
		// TODO Auto-generated method stub

	}

}
