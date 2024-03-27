package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action = new Actions(driver);
		
		//mouse hover Men's fashion
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		action.moveToElement(ele1).perform();
		
		//click sport shoes
		WebElement ele2 = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		action.click(ele2).perform();;
		
		//shoes count
		String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Sports shoes count: " + shoesCount);
		
		//click on training shoes
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		action.click(ele3).perform();
		
		//handle drop down
		WebElement ele4 = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
		action.click(ele4).perform();
		
		//click price low to high
		WebElement ele5  = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		action.click(ele5).perform();
		
		//verify price list from low to high
		Thread.sleep(10000);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		for (WebElement each : price) {
			String s = each.getText();
			String s1 = s.replaceAll("[^0-9]", "");
			int s2 = Integer.parseInt(s1);
			priceList.add(s2);
		}
		System.out.println(priceList);
		
		int count =0;
		for (int i = 0; i < priceList.size()-1; i++) {
			if(priceList.get(i)>priceList.get(i+1))
					{
						System.out.println("Prices are not in sorted order");
						count++;
						break;
					}
				}
		if(count == 0)
			System.out.println("The prices are in sorted order");
		
		
		//enter price values
		WebElement web1 = driver.findElement(By.xpath("//div[@class='price-text-box']"));
		action.scrollToElement(web1).perform();
		
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("600");
		
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("800");
		
		//click go
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		//move to element colour
		WebElement web4 = driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]"));
		action.scrollToElement(web4).perform();
		
		//choose colour 
		WebElement ele6 = driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]"));
		action.scrollToElement(ele6).click(ele6).perform();
		
		Thread.sleep(10000);
		//display filters
		String filter1 = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[1]")).getText();
		String filter2 = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[2]")).getText();
		System.out.println("Filter1: " + filter1);
		System.out.println("Filter2: " + filter2);
		
		//verify filters
		if(filter1.contains("Price") && (filter2.contains("Black")))
			System.out.println("Apllied filters price and colour are verified");
		
		//hover mouse on image
		WebElement ele7 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		action.moveToElement(ele7).perform();
		
		//click quick view
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		
		//Set<String> windowSet = driver.getWindowHandles();
		//List<String> windowList = new ArrayList<String>(windowSet);
		//driver.switchTo().window(windowList.get(1));
			
		//display shoe price and discount
		String shoePrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
		System.out.println("Shoe Price: " + shoePrice + "Discount: " + discount);
		
		//snapshot
		WebElement webe1 = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File source = webe1.getScreenshotAs(OutputType.FILE);
		File destination = new File("./priyaScreenshots/shoePic2.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		//driver.close();
			
	}
}
