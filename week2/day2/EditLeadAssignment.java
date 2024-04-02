package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//CRM/SFA
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Leads //createLead
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//details
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("priyapalanisamy@gmail.com");
		WebElement web1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1 = new Select(web1);
		sel1.selectByValue("TX");
		
		//submit
		driver.findElement(By.className("smallSubmit")).click();
		//edit
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am Robot class");
		//update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//getTitle
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
		
	}

}
