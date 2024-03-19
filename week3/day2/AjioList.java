package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AjioList {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags" + Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Items found
		WebElement ele1 = driver.findElement(By.xpath("//strong[text()=' Items Found']"));
		String itemsfound = ele1.getText();
		System.out.println("Result: " + itemsfound);
		
		//Brands name
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> list1 =new ArrayList<String>(); 
		System.out.println("No. of Brands present: " + brandNames.size());
		//Convert Webelement into string and store string in a list
		for (WebElement each : brandNames) {
			list1.add(each.getText());
		}
		Collections.sort(list1);
		System.out.println(list1);
		
		
		//Bags Name
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> List2 = new ArrayList<String>();
		System.out.println("No. of Bags present: " + bagNames.size());
				
		for (WebElement each : bagNames) {
			List2.add(each.getText());
		}
		Collections.sort(List2);
		System.out.println(List2);
		
	}

}
