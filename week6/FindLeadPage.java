package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadPage extends BaseClass{
	String leadID;
	
	public FindLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	/*public FindLeadPage enterLeadID() {
		System.out.println("enter lead ID: " + leadID);
		driver.findElement(By.id("ext-gen246")).sendKeys(leadID);
		return this;
	}
	
	public  void getResult() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		String expectedText = "No records to display";
		Assert.assertEquals(text, expectedText);
		System.out.println("Expected record deleted successfully: " + text);
		
	}*/
	
	public FindLeadPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	
	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		return this;
	}
	
	public EditLeadPage clickFirstResult() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new EditLeadPage(driver);
	}
	
	public ViewLeadsPage clickFirstResultforDeleting() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("LeadID: " + leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver);
	}
	

}
