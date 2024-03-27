package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
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
		
		//contacts
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Merge Contacts")).click();
				
		//window handler
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> win = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(win);
		driver.switchTo().window(listWindows.get(1));
		driver.manage().window().maximize();
		
		//inside window
		driver.findElement(By.linkText("dontship2me")).click();
		//move to parent window
		driver.switchTo().window(listWindows.get(0));
		
		//window handler 2
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> win2 = driver.getWindowHandles();
		List<String> listWindows2 = new ArrayList<String>(win2);
		driver.switchTo().window(listWindows2.get(1));
		//driver.manage().window().maximize();
		
		//inside window
		driver.findElement(By.linkText("DemoLBCust")).click();
		driver.switchTo().window(listWindows.get(0));
		
		//click merge button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//Thread.sleep(10000);
		
		//handle alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(10000);
		//print title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//verify title of the page
		if(title.contains("View"))
			System.out.println("Contact merged successfully");
		
		
		
		
	}

}
