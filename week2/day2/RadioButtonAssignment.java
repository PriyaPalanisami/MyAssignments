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
		
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Chennai']"));
		ele2.click();
		System.out.println("Radiobutton unselected:" + ele2.isSelected());
				
		boolean chrome = driver.findElement(By.xpath("//label[text()='Chrome']")).isSelected();
		boolean firefox = driver.findElement(By.xpath("//label[text()='Firefox']")).isSelected();
		boolean safari = driver.findElement(By.xpath("//label[text()='Safari']")).isSelected();
		boolean edge = driver.findElement(By.xpath("//label[text()='Edge']")).isSelected();
		System.out.println("Chrome selected:" + chrome);
		System.out.println("Firefox selected:" + firefox);
		System.out.println("Safari selected:" + safari);
		System.out.println("Edge selected:" + edge);
		
	
		

	}

}
