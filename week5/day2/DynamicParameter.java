package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DynamicParameter {

	@DataProvider(name = "dataSource")
	public String[][] dataBase() {
		
		String[][] a = new String[3][4];
		
		a[0][0] = "HCL";
		a[0][1]= "Priya";
		a[0][2]="P";
		a[0][3]="99";
		
		a[1][0] = "ZOHO";
		a[1][1]= "Priya";
		a[1][2]="P";
		a[1][3]="99";
		
		a[2][0] = "Accenture";
		a[2][1]= "Priya";
		a[2][2]="P";
		a[2][3]="99";
		
		return a;
		

	}
	
	
	
	
	@Test(dataProvider="dataSource")
	public void runCreateLead(String a, String b, String c, String d) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(a);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(b);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(c);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(c);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead Created: " + text );
	}
}
