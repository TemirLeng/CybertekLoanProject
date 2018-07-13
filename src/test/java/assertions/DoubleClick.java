package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	//go to http://primefaces.org/showcase/ui/misc/effect.xhtml
	//locate 'Fold/double click' element
	//double click on it
//	@Test (priority = 1)
//	public void doubleClick() throws InterruptedException {
//		driver.get("http://primefaces.org/showcase/ui/misc/effect.xhtml");
//		WebElement fold = driver.findElement(By.id("fold"));
//		Actions action = new Actions(driver);
//		action.doubleClick(fold).perform();
//		Thread.sleep(3000);
//		Assert.assertFalse(fold.isDisplayed());
//	}
//	
//	@Test (priority = 2)
//	public void puff() {
//		driver.get("http://primefaces.org/showcase/ui/misc/effect.xhtml");
//		WebElement puff = driver.findElement(By.id("puff"));
//		Actions action = new Actions(driver);
//		action.doubleClick(puff).perform();
//	}	
//	
//	//go to https://demos.telerik.com/kendo-ui/dragdrop/index
//	//drag small circle and drop it into big circle
//	//verify message "You did great!"
//	@Test (priority = 3)
//	public void dragAndDrop() {
//		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//		WebElement smallCircle = driver.findElement(By.id("draggable"));
//		WebElement bigCircle = driver.findElement(By.id("droptarget"));
//		driver.findElement(By.xpath("//a[@class='optanon-allow-all']")).click();
//		Actions action = new Actions(driver);
////		action.dragAndDrop(smallCircle, bigCircle).perform();
//		action.clickAndHold(smallCircle).moveToElement(bigCircle).perform();
////		String actual = bigCircle.getText();
////		String expected = "You did great!";
////		Assert.assertEquals(actual, expected);		
//	}
//	
	@Test (priority = 4)
	private void rightClick() throws InterruptedException {
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rc = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rc).perform();
		action.contextClick(rc).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).build().perform();	
		 Thread.sleep(3000);
	}
	
	@Test //(priority = 5)
	public void uploading() throws InterruptedException {
		String path = "C:\\Users\\Elturan\\Pictures";
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
		chooseFileBtn.sendKeys(path);
		driver.findElement(By.id("file-submit")).click();
		 Thread.sleep(4000);
	}
	
	

	
	

}
