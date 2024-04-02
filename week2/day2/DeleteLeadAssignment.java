package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
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
		
		//find leads
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
		//phone tab
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		//enter ph.no.
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("priyapalanisamy@gmail.com");
		//find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//pick first one
		Thread.sleep(10000);
		WebElement web1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		String s = web1.getText();
		System.out.println("Lead ID" + "=" + s);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		//delete
		driver.findElement(By.partialLinkText("Delete")).click();
		
		//find leads
		driver.findElement(By.partialLinkText("Find Leads")).click();
		//enter lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(s);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement web2 = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String s1 = web2.getText();
		
		if (s1.equalsIgnoreCase("No records to display")) {
			
			System.out.println("Record deleted correctly");
		}
		else
		{
			System.out.println("The record not deleted properly");
		}	
		
	}
}
