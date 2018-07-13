package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteTest {
	
	WebDriver driver;
	
	@Test
	public void loginBtn() throws InterruptedException {
		driver.get("http://softaculous.com/demos/SuiteCRM");
        driver.switchTo().frame("demobody");	
        LoginPage lp =  new LoginPage(driver);
        lp.username.sendKeys("admin");
        lp.password.sendKeys("pass");
        lp.loginBtn.click();
        Thread.sleep(3000);
        HomePage hp = new HomePage(driver);
        hp.textBox.sendKeys("Using POM" + Keys.ENTER);
	}

}
