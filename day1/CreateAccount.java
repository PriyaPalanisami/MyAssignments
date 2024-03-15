package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("PriyaPalanisa");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement web1 = driver.findElement(By.name("industryEnumId"));
		Select sel1 = new Select(web1);
		sel1.selectByIndex(3);
		
		WebElement web2 = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(web2);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement web3 = driver.findElement(By.id("dataSourceId"));
		Select sel3 = new Select(web3);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement web4 = driver.findElement(By.id("marketingCampaignId"));
		Select sel4 = new Select(web4);
		sel4.selectByIndex(6);
		
		WebElement web5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel5 = new Select(web5);
		sel5.selectByValue("TX");	
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		 WebElement web6 = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		 String accountName = web6.getText();
		 
		System.out.println("Account name: " + accountName);
		
		
		
		

	}

}
