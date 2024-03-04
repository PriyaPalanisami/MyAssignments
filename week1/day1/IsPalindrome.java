package week1.day1;

public class IsPalindrome {
	
	public static void main(String[] args) {
		 int n = 1234;
		 int m = n;
		 int d = 4;
		 int ne = 0;
		 int r;
		 
		 for (int i = d; i > 0; --i) {
			
			 r = n%10;
			 n = n/10;
			 ne = ne + (r * (int)Math.pow (10, (i-1)));
			 System.out.println(ne);
			 
		}
		 if(m == ne)
		  System.out.println("The given number is a Palindrome: " + m);
		 else
			 System.out.println("The given number is not a Palindrome: " + m); 
	}

}
