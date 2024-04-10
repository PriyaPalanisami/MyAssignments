package testcases;


import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass {
	
	@Test
	public void runEditLead() throws InterruptedException {
		
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsMenu()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumber()
		.clickFindLeadButton()
		.clickFirstResult()
		.clickEditTab()
		.editCompanyName()
		.clickUpdateButton()
		.getCompanyName();
			
	}

}
