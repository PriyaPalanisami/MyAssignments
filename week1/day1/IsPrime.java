package week1.day1;

public class IsPrime {
	
	
public static void main(String[] args) {
	
	int n = 10; String num = "prime";
	
	for (int i = 2; i < n; i++) 
	{
		
		if(n%i == 0)
		{
			System.out.println("The given number is not a prime number: " + n); 
			num = "notprime"; 
			break;
		}
	
     }
	
	if(num == "prime")
		System.out.println("The given number is a prime number: " + n);

}
}