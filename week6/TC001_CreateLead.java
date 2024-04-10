package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClass {
	
	@Test
	public void runCreateLead() {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsMenu()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhoneNumber()
		.clickSubmitButton()
		.getCompanyName();
		
	}

}
