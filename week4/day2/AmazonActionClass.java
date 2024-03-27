package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
		action.keyUp(Keys.ENTER).perform();
		
		//price
		String mobilePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of first product: " + mobilePrice);
		String mp1 = mobilePrice.replaceAll("[^0-9]", "");
		int mp = Integer.parseInt(mp1);
		System.out.println("int:  " + mp);
		
		//rating
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Number of ratings of the first product: " + ratings);
		
		//first link
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
			
		//window handle 1
		Set<String> windowSet1 = driver.getWindowHandles();
		List<String> windowList1 = new ArrayList<String>(windowSet1);
		driver.switchTo().window(windowList1.get(1));
		
		//screenshot element
		WebElement webe1 = driver.findElement(By.xpath("//img[@id='landingImage']"));
		Thread.sleep(10000);
		File source = webe1.getScreenshotAs(OutputType.FILE);
		File destination = new File("./priyaScreenshots/pic4A.png");
		FileUtils.copyFile(source, destination);
		
		//Add to cart
		Thread.sleep(10000);
		WebElement webe2 = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]"));
		action.moveToElement(webe2).click().perform();
		
		Thread.sleep(10000);
		//get subtotal
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart Sub total: " + subTotal);
		String st1 = subTotal.replaceAll("[^0-9.]", "");
		double d = Double.parseDouble(st1);
		int st = (int)d;
		System.out.println("int:  " + st);
		
		if (mp==st) {
			System.out.println("Onepluse mobile added to cart successfully  " + " Price checked");
		}
		
		driver.close();
		driver.switchTo().window(windowList1.get(0));
		driver.close();
		
	}

}
