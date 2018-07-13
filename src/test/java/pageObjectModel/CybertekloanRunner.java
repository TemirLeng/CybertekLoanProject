package pageObjectModel;

import org.testng.annotations.Test;

import utilities.Config;
import utilities.Driver;

public class CybertekloanRunner {
	
	CybertekLoan page = new CybertekLoan();
	
	@Test
	public void personalInformationPage() {
		Driver.getDriver().get(Config.getValue("url"));
		CybertekLoan.switchFrame();
		page.firstNameBox.sendKeys(Config.getValue("firstName"));
		page.middleNameBox.sendKeys(Config.getValue("middleName"));
		page.lastNameBox.sendKeys(Config.getValue("lastName"));
		page.maleBtn.click();
		page.dateBox.sendKeys(Config.getValue("dateOfBirth"));
		page.idBox.sendKeys(Config.getValue("id"));
		page.loanBox.sendKeys(Config.getValue("loan"));
		page.nextBtn.click();
		

		
	}

}
