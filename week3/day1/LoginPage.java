package week3.day1;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTask() {
		
		System.out.println("Perform common task - Sub class");
	}
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.clickElement();
		lp.enterText();
		lp.findElement();
		lp.performCommonTask();
		
		BasePage bp = new BasePage();
		bp.performCommonTask();
	}

}
