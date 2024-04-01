package week5.day1;

import org.testng.annotations.Test;

public class DependencyOnMethodExample {

	@Test(dependsOnMethods="week5.day1.MergeLead.runMergeLead")
	
	public void multiply() {
		
		
			int a=4,b=3;
			int c = a*b;
			System.out.println("Product is: " + c);
		}
	}

