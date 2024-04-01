package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectSpecificMethod {

	
	public ChromeDriver driver;
	
	@BeforeSuite
	public void start() {
		
		System.out.println("Before Suite: Starting Suite");
	}
	
	@BeforeTest
	public void set() {
		
		System.out.println("Before Test: Starting test");
	}
	
	@BeforeClass
	public void assign() {
		System.out.println("Before Class: Starting class");
	}
	
	
	@BeforeMethod
	public void preCondition() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		
	    driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
		
	@AfterMethod
	public void postCondition() {
		
		System.out.println("After Method: closing method");
		driver.close();

	}
	
	@AfterClass
	public void afterClass1() {
		
		System.out.println("After class: Closing class");

	}
	
	@AfterTest
	public void afterTest1() {
		
		System.out.println("After test: closing test");
	}
	
	@AfterSuite
	public void stop() {
		
		System.out.println("After suite: Closing Suite");
	}
	

	
	
	
	
}
