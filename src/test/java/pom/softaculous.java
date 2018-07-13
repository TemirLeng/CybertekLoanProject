package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softaculous {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void loginBtn() throws InterruptedException {
		String url = "http://softaculous.com/demos/SuiteCRM";
		driver.get(url);
        driver.switchTo().frame("demobody");		
		WebElement userName = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement loginBtn = driver.findElement(By.id("bigbutton"));
		userName.sendKeys("admin");
		password.sendKeys("pass");
		loginBtn.click();
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.xpath("(//input[@id='text'])[1]"));
		textBox.sendKeys("Jamila`s Test" + Keys.ENTER);
	}


}

//		String url = "http://automationpractice.com/index.php";