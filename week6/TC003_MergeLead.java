package testcases;

import org.testng.annotations.Test;


import base.BaseClass;
import pages.LoginPage;

public class TC003_MergeLead extends BaseClass{
	
	@Test
	public void runMergeLead() throws InterruptedException
	{
	  new LoginPage(driver)
	  .enterUsername()
	  .enterPassword()
	  .clickLoginButton()
	  .clickCrmsfaLink()
	  .clickLeadsMenu()
	  .clickMergeLead()
	  .clickLookUpLeads1()
	  .moveTolookUpLeadsWindow()
	  .enterFirstNameInLookUpWindowPage()
	  .clickFindLeadInLookUpWindow()
	  .clickNameInLookUpWindow()
	  .backToMergeLeadWindow()
	   .clickLookUpLeads2()
	  .moveTolookUpLeadsWindow()
	  .enterSecondNameInLookUpWindow()
	  .clickFindLeadInLookUpWindow()
	  .clickNameInLookUpWindow()
	  .backToMergeLeadWindow()
	  .clickMergeButton()
	  .acceptAlert()
	  .getCompanyName();
	
	  
	  
	}

}
