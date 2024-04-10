package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() {
		
		System.out.println("Before method starts");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		System.out.println("After method Stops");
		//driver.close();

	}
	
	@DataProvider(name = "fetchDetails", indices=1)
	public String[][] sendData() throws IOException {
		System.out.println("Data provider method calls readexcel");
		String [][] data = ReadExcel.readData(fileName);
		return data;

	}

}
