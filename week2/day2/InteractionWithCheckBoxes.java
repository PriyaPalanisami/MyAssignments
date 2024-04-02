package week2.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractionWithCheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://leafground.com/checkbox.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 //click basic checkbox
		 driver.findElement(By.xpath("//span[text()='Basic']")).click();
		 
		  //click Ajax
		 driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		 
		 //to get message
		 String s = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		 if(s.equalsIgnoreCase("checked"))
			 System.out.println("The Expected message CHECKED is located: " + s);
		 
		 //many check boxes //Java, Python 
		 WebElement webe1 = driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c'])[1]"));
		 driver.executeScript("arguments[0].click();", webe1);
		 WebElement webe2 = driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c'])[2]"));
		 driver.executeScript("arguments[0].click();", webe2);
		 
		 Thread.sleep(20000);
		 //click Tri state
		 WebElement webe3 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']"));
		 driver.executeScript("arguments[0].click();", webe3);
		 
				 
		 //to get message
		 String s1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span[@class='ui-growl-title']/following-sibling::p")).getText();
		 
		 if(s1.contains("State"))
		 {
			 System.out.println("The state of Tri state checkbox : " + s1); 
		 }
		 
		 //toggle checkbox to get msg
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		 String s2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		 System.out.println("Toggle switch state: " + s2);
		 
		 //checkbox enabled/disabled
		 boolean boo = driver.findElement(By.xpath("//input[@aria-label='Disabled']")).isEnabled();
		 
		if(boo)
			 System.out.println("The Checkbox is enabled");
		else
			 System.out.println("The checkbox is disabled");
		 
		 //select multiple
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		
		Thread.sleep(10000);
		List<WebElement> l1 = driver.findElements(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']/label"));
		List<String> l2 = new ArrayList<String>();
		for (int i = 0; i < l1.size(); i++) {
			l2.add(l1.get(i).getText());
		}
		
		System.out.println("Multiple options in the list are: " + l2); 
		
		//click multiple
		WebElement webele1 = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/span[@class='ui-chkbox-icon ui-icon ui-icon-blank'])[4]"));
		driver.executeScript("arguments[0].click();", webele1);

		WebElement webele2 = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/span[@class='ui-chkbox-icon ui-icon ui-icon-blank'])[5]"));
		driver.executeScript("arguments[0].click();", webele2);
		
		//close the multiple
		WebElement webele3 = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']"));
		driver.executeScript("arguments[0].click();", webele3);
		
		
		driver.close();
		
	}
}
