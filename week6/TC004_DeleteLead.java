package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC004_DeleteLead extends BaseClass {
	
	@Test
	public void runDeleteLead() throws InterruptedException {
		
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
	    .clickFirstResultforDeleting()
	    .clickDelete();
	    
	  
	    
	    
	}

}
