package week2.day2;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGround {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page: " + title);
		
		//verify title
		if(title.contains("Dashboard"))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not matched");
		}
		
		driver.navigate();
				
		WebElement web1 = driver.findElement(By.xpath("//span[text()='Element']"));
		driver.executeScript("arguments[0].click();", web1);
		
		WebElement web2 = driver.findElement(By.xpath("//span[text()='Button']"));
		driver.executeScript("arguments[0].click();", web2);
		
		//find button is disabled
		boolean boo = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if(boo)
		{
			System.out.println("The button is enabled");
		}
		else
		{
			System.out.println("The button is disabled");
		}
		
		//get position using Rectangle
		 Rectangle res = driver.findElement(By.xpath("//span[text()='Submit']")).getRect();
		 System.out.println("The position of the button: " + res.getX() + "   " + res.getY());
		 
		//get position using Point
		 Point p1 = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		 System.out.println(p1.getX() + "   " +p1.getY());
		 
		 //get background color of the button
		 String cssValue = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		 System.out.println("RGBA values: " + cssValue);
		 
		 	 
		 //get size using Rectangle
		 Rectangle rect2 = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getRect();
		 System.out.println("The size of the button:  " + rect2.getHeight() + "   " + rect2.getWidth());
		 
		 //get size using Dimension
		 Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		 System.out.println(size.getHeight() + "  " + size.getWidth());
		 
		 
		 //driver.close();
		 
	}
}
