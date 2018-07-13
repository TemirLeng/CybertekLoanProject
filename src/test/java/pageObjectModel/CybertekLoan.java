package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CybertekLoan {
	
	WebDriver driver;
	public CybertekLoan() {
	driver = Driver.getDriver();
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="SingleLine")
	public WebElement firstNameBox;
	
	public static void switchFrame() {
		WebElement frame = Driver.getDriver().findElement(By.xpath("(//iframe)[2]"));
		Driver.getDriver().switchTo().frame(frame);
	}
	
	@FindBy(name="SingleLine1")
	public WebElement middleNameBox;
	
	@FindBy(name="SingleLine2")
	public WebElement lastNameBox;
	
	@FindBy(name="Radio-choice")
	public WebElement maleBtn;
	
	@FindBy(name="date")
	public WebElement dateBox;
	
	@FindBy(name="Number")
	public WebElement idBox;
	
	@FindBy(name="Number6")
	public WebElement loanBox;
	
	@FindBy(xpath="(//button[@class='fmSmtButton next_previous'])[1]")
	public WebElement nextBtn;
	

}
