package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationProcess extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		System.out.println("Before test set values");
		fileName = "RegisterData";

	}
	
	@Test(dataProvider = "fetchDetails")
	public void toRegister(String fName, String eMail, String address, String city, String state, String zip, String cvv, String creditCardNumber, String cName) {
		
		System.out.println("My test case runs");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("cname")).sendKeys(cName);
		System.out.println("Name on the card: "+ cName);
		driver.findElement(By.id("ccnum")).sendKeys(creditCardNumber);
		System.out.println("Credit card number: "+ creditCardNumber);
		driver.findElement(By.id("expmonth")).sendKeys("Oct");
		driver.findElement(By.id("cvv")).sendKeys(cvv);
		System.out.println("CVV: "+ cvv);
		driver.findElement(By.id("expyear")).sendKeys("2018");
		driver.findElement(By.id("fname")).sendKeys(fName);
		System.out.println("Full name: "+ fName);
		driver.findElement(By.id("email")).sendKeys(eMail);
		System.out.println("Email: "+ eMail);
		driver.findElement(By.id("adr")).sendKeys(address);
		System.out.println("Address: "+address );
		driver.findElement(By.id("city")).sendKeys(city);
		System.out.println("City: "+ city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		System.out.println("Zip: "+ zip);
		driver.findElement(By.id("state")).sendKeys(state);
		System.out.println("State: "+ state);
		System.out.println("my test case reached end of the line");
		
	}

}
  