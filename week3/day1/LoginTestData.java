package week3.day1;

public class LoginTestData extends TestData {

	public void enterUsername() {
		
		System.out.println("Please Enter Username - Subclass - Username method");
	}
	
	public void enterPassword() {
		
		System.out.println("Please Enter Password -  Subclass - Password method");
	}
	
	public static void main(String[] args) {
		
		LoginTestData login = new LoginTestData();
		login.enterCredentials();  //super class method
		login.navigateToHomePage(); //super class method
		login.enterUsername(); //sub class method
		login.enterPassword(); //sub class method
	}
}
