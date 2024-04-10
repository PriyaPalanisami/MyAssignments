package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		return this;
	}
	
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		return this;
	}
	
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palanisamy");
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("900");
		return this;
	}
	
	public ViewLeadsPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
	

}
