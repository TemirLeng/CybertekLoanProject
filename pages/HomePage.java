package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ConfigurationReader;
import utils.Driver;

public class HomePage {
	private WebDriver driver;

	private HomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-noSignupForm']//a[contains(text(),'Log in')]")
	private WebElement homeLogInBtn;

	public static boolean isAt() {
		return Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("homePageTitle"));
	}
	
	private static String title() {
		return Driver.getDriver().getTitle();
	}
}
