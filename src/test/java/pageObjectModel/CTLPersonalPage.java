package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class CTLPersonalPage {
	
	WebDriver driver;
	public CTLPersonalPage() {
	   driver = Driver.getDriver();
	   PageFactory.initElements(driver, this);
	}

//  ============================ Personal Information Page ==============================

	@FindBy(name="SingleLine")
    public WebElement firstNameBox;
	
    @FindBy(name="SingleLine1")
    public WebElement middleNameBox;
    
    @FindBy(name="SingleLine2")
    public WebElement lastNameBox;
    
    @FindBy(xpath="(//input[@name='Radio-choice'])[2]")
    public WebElement genderBox;
    
    @FindBy(name="date")
    public WebElement dateOfBirthBox;
    
//    @FindBy(xpath="(//label[@class='labelName'])[5]")
//    public WebElement clickBtn;
    
    @FindBy(name="Number")
    public WebElement idBox;
    
    @FindBy(name="Number6")
    public WebElement loanAmountBox;
    
    @FindBy(xpath="//button[@class='fmSmtButton next_previous']")
    public WebElement nextBtn1;   
    
    public static void switchFrame() {
    	WebElement frame = Driver.getDriver().findElement(By.xpath("(//iframe)[2]"));
    	Driver.getDriver().switchTo().frame(frame);
    }
    
//  ============================ Contact Information Page ==============================
    		
    @FindBy(name="Address_AddressLine1")
    public WebElement streetAddressBox;
    
    @FindBy(name="Address_AddressLine2")
    public WebElement addressLine2Box;
    
    @FindBy(name="Address_City")
    public WebElement cityBox;
    
    @FindBy(name="Address_Region")
    public WebElement stateRegionProvinceBox;
    
    @FindBy(name="Address_ZipCode")
    public WebElement postalZipCodeBox;
    
    @FindBy(id="Address_Country")
    public WebElement countrySelect;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[1]//input[@type='text'])[1]")
    public WebElement phone1Box;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[1]//input[@type='text'])[2]")
    public WebElement phone2Box;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[1]//input[@type='text'])[3]")
    public WebElement phone3Box;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[2]//input[@type='text'])[1]")
    public WebElement work1Box;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[2]//input[@type='text'])[2]")
    public WebElement work2Box;
    
    @FindBy(xpath="((//li[@class='tempFrmWrapper phone'])[2]//input[@type='text'])[3]")
    public WebElement work3Box;   
    
    @FindBy(xpath="//*[@id=\"Address_Country\"]/option[16]")
    public WebElement australia;
    
    @FindBy(xpath="//*[@id=\"Address_Country\"]/option[237]")
    public WebElement turkey;
    
    @FindBy(name="Number1")
    public WebElement extensionBox;
    
    @FindBy(name="Email")
    public WebElement personalEmailBox;
    
    @FindBy(name="Email1")
    public WebElement workEmailBox;
    
    @FindBy(xpath="(//button[@class='fmSmtButton next_previous'])[3]")
    public WebElement nextBtn2;
    
//  ============================ Employment Information Page ==============================
    
    @FindBy(name="Dropdown")
    public WebElement titleBox;

    public void selectTitle() {
    	Select sl = new Select(titleBox);
    	sl.selectByValue("QA");;
    }
    
    @FindBy(name="Dropdown1")
    public WebElement departmentBox;
    
    public void selectDepartment() {
    	Select s2 = new Select(departmentBox);
    	s2.selectByValue("Tech Support");;
    }
        
    @FindBy(name="Dropdown2")
    public WebElement durationOfEmploymentBox;
    
    public void selectDurationOfEmployment() {
    	Select s3 = new Select(durationOfEmploymentBox);
    	s3.selectByValue("5-10");
    }
          
    @FindBy(name="Dropdown3")
    public WebElement purposeOfLoanBox;
    
    public void selectPurposeOfLoan() {
    	Select s4 = new Select(purposeOfLoanBox);
    	s4.selectByValue("Education");
    }   
    
    @FindBy(name="Dropdown4")
    public WebElement supervisorBox;
    
    public void selectSupervisor() {
    	Select s5 = new Select(supervisorBox);
    	s5.selectByValue("William Cranston");
    }     
    
    @FindBy(xpath="(//button[@class='fmSmtButton next_previous'])[5]")
    public WebElement nextBtn3;
  
//  ============================ Financial Information Page ==============================
    
    @FindBy(xpath="(//input[@type='radio'])[3]")
    public WebElement yesBtn;
    
    @FindBy(xpath="(//input[@type='radio'])[4]")
    public WebElement noBtn;
    
    @FindBy(name="Number2")
    public WebElement countApBox;
    
    @FindBy(name="SingleLine3")
    public WebElement annualIncomeBox;
    
    @FindBy(name="Dropdown5")
    public WebElement incomeTypeBox;
    
    public void selectIncomeType() {
    	Select s6 = new Select(incomeTypeBox);
    	s6.selectByValue("Biweekly");
    }  
    
    @FindBy(xpath="(//input[@type='radio'])[5]")
    public WebElement ownBtn;
    
    @FindBy(xpath="(//input[@type='radio'])[6]")
    public WebElement RentBtn;
    
    @FindBy(name="Number3")
    public WebElement monthlyRentBox;
    
    @FindBy(name="Number4")
    public WebElement dependentsBox;
    
    @FindBy(name="Number5")
    public WebElement savingsBox;
    
    @FindBy(name="Dropdown6")
    public WebElement loanTermBox;
    
    public void selectLoanTerm() {
    	Select s7 = new Select(loanTermBox);
    	s7.selectByValue("12 months");
    }  
    
    @FindBy(id="DecisionBox")
    public WebElement checkBoxBtn;
    
    @FindBy(name="SingleLine5")
    public WebElement singleLineBox;
    
    @FindBy(id="Date1-date")
    public WebElement dateBox;
    
    @FindBy(xpath="//button[@class='fmSmtButton submitColor fmSmtButtom']")
    public WebElement submitBox;
    

}



