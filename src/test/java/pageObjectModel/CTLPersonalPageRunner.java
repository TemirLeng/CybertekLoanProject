package pageObjectModel;

import org.testng.annotations.Test;

import utilities.Config;
import utilities.Driver;

public class CTLPersonalPageRunner {
	
	CTLPersonalPage page = new CTLPersonalPage();
	@Test (priority=1)
	public void personalInfoPage() throws InterruptedException {
		Driver.getDriver().get(Config.getValue("url"));
		String title1 = Driver.getDriver().getTitle();
		System.out.println(title1);
		CTLPersonalPage.switchFrame();
		page.firstNameBox.sendKeys(Config.getValue("firstName"));
		page.middleNameBox.sendKeys(Config.getValue("middleName"));
		page.lastNameBox.sendKeys(Config.getValue("lastName"));
		Thread.sleep(1000);
		page.genderBox.click();
		page.dateOfBirthBox.sendKeys(Config.getValue("dateOfBirth"));
		page.idBox.sendKeys(Config.getValue("id"));
		page.loanAmountBox.sendKeys(Config.getValue("loan"));
		Thread.sleep(1000);
		page.nextBtn1.click();
		String title2 = page.driver.getTitle();
		System.out.println(title2);
	}
	
	@Test (priority=2)
	public void contactInfoPage() throws InterruptedException {
		page.streetAddressBox.sendKeys(Config.getValue("streetAddress"));
		page.addressLine2Box.sendKeys(Config.getValue("addressLine2"));
		page.cityBox.sendKeys(Config.getValue("city"));
		page.stateRegionProvinceBox.sendKeys(Config.getValue("stateRegionProvince"));
		page.postalZipCodeBox.sendKeys(Config.getValue("postalZipCode"));
		page.countrySelect.click();
		page.turkey.click();
		Thread.sleep(1000);
		page.phone1Box.sendKeys(Config.getValue("phone1"));
		page.phone2Box.sendKeys(Config.getValue("phone2"));
		page.phone3Box.sendKeys(Config.getValue("phone3"));
		Thread.sleep(1000);
		page.work1Box.sendKeys(Config.getValue("work1"));
		page.work2Box.sendKeys(Config.getValue("work2"));
		page.work3Box.sendKeys(Config.getValue("work3"));
		Thread.sleep(1000);
		page.extensionBox.sendKeys(Config.getValue("extension"));
		page.personalEmailBox.sendKeys(Config.getValue("personalEmail"));
		page.workEmailBox.sendKeys(Config.getValue("workEmail"));
		page.nextBtn2.click();
	}
	
	@Test (priority=3)
	public void employmentInfoPage() throws InterruptedException {
		page.selectTitle();
		Thread.sleep(1000);
		page.selectDepartment();
		Thread.sleep(1000);
		page.selectDurationOfEmployment();
		Thread.sleep(1000);
		page.selectPurposeOfLoan();
		Thread.sleep(1000);
		page.selectSupervisor();
		Thread.sleep(1000);
		page.nextBtn3.click();			
	}
	
	@Test (priority=4)
	public void financialInfoPage() throws InterruptedException {
		page.yesBtn.click();
		page.annualIncomeBox.sendKeys(Config.getValue("annualIncome"));
		Thread.sleep(1000);
		page.selectIncomeType();
		page.RentBtn.click();
		Thread.sleep(1000);
		page.monthlyRentBox.sendKeys(Config.getValue("monthlyRent"));
		page.dependentsBox.sendKeys(Config.getValue("dependents"));
		Thread.sleep(1000);
        page.savingsBox.sendKeys(Config.getValue("savings"));
        page.selectLoanTerm();
        Thread.sleep(1000);
        page.checkBoxBtn.click();
        page.singleLineBox.sendKeys(Config.getValue("singleLine"));
        Thread.sleep(1000);
        page.dateBox.sendKeys(Config.getValue("date"));
        page.submitBox.click();		
	}

}
