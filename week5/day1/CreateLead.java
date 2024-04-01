package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	
	@Test
	public void runCreateLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Created lead successfully");
		}
		else {
			System.out.println("Created lead not executed");
		}
	}
	
	@Test(enabled=false)
	public void add() {
		
		int a=4,b=3;
		int c = a+b;
		System.out.println("sum is: " + c);
	}
	
	@Test(priority = -1)
	public void sub() {
		
		int a=4,b=3;
		int c = a-b;
		System.out.println("sub is: " + c);
	}
	
	
}
