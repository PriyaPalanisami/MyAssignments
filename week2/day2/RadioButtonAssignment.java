package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtonAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.findElement(By.xpath("//label[text()='Edge']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Chennai']"));
		if (ele2.isSelected()) {
			System.out.println("Radio button of chennai selected");
		}
		else
			System.out.println("Radio button of chennai unselected");
		
						
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']"));
		if (ele3.isSelected()) {
			System.out.println("The default button clicked is Chrome");
		}
		
		
		WebElement ele4 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']"));
		if (ele4.isSelected()) {
			System.out.println("The default button clicked is Firefox");
		}
		
		
		WebElement ele5 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		if (ele5.isSelected()) {
			System.out.println("The default button clicked is Safari");
		}
		
		
		WebElement ele6 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']"));
		if (ele6.isSelected()) {
			System.out.println("The default button clicked is Edge");
		}
		
			
		
		boolean t = driver.findElement(By.id("j_idt87:age:1")).isSelected();
		if (t) {
			System.out.println("21-40 Years is already selected");
		}
		else
			driver.findElement(By.id("j_idt87:age:1")).click();
		}
		
		
		
		
	
		

	}


