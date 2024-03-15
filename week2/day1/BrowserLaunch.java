package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.findElement(By.partialLinkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Priya");
	    driver.findElement(By.name("lastname")).sendKeys("Palanisamy");
	    driver.findElement(By.name("reg_email__")).sendKeys("priyapalanisamy30@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("priyapalanisamy30@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Dhinesh@p198");
	    
	    // Drop down using select
	   WebElement bday = driver.findElement(By.id("day"));
	   Select sel1 = new Select(bday);
	   sel1.selectByValue("30");
	    
	   //Drop down using send keys
	    //driver.findElement(By.name("birthday_day")).sendKeys("30");
	    driver.findElement(By.name("birthday_month")).sendKeys("Sep");
	    driver.findElement(By.name("birthday_year")).sendKeys("1995");
	    
	    //Radio button
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	     
		
	}

}
