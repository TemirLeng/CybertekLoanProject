package textReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Config;

public class WebOrder {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elturan\\Documents\\selenium dependencies\\drivers\\chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		String url = Config.getValue("url");
		System.out.println("This is url coming from properties file: " + url);
		driver.get(Config.getValue("url"));
//		driver.findElement();
		

	}

}
