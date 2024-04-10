package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {

	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage clickEditTab() throws InterruptedException {
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(10000);
		return this;
	}
	
	public EditLeadPage editCompanyName() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Accenture");
		return this;
	}
	
	public ViewLeadsPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
