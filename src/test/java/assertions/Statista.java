package assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statista {
	
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	@Test
	private void navigateTabs() throws InterruptedException {
		driver.get("https://www.statista.com");
		List<WebElement>navigators = driver.findElements(By.xpath("//div[@id='navigation']/nav/ul/li"));
		
		Actions action = new Actions(driver);
		for(int i = 0; i<navigators.size()-2; i++) {
			action.moveToElement(navigators.get(i)).perform();   //perform() == let`s go
			Thread.sleep(2000);
		}
				
	}
	
	@AfterClass
	private void closing() {
		driver.close();

	}

}
