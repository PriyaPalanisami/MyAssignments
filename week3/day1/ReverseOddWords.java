package week3.day1;



public class ReverseOddWords {
	
	
	public static void main(String[] args) {
		
		String s = "I am a Software Engineer";
		int i,j;
		
		System.out.println("The given string: " + s);

		//Split the string
		String[] s1 = s.split(" ");
		
		System.out.println("After splitting into separate strings:");
		
		//Print & check
		for (String each : s1) {
			System.out.print("   " + each);
		}
		
		//print only even number
		System.out.println("");
		System.out.println("Output: ");
		for (i = 0; i < s1.length; i++) {
			if(i%2!=0)
			{
				 
				 int len =s1[i].length();
			     char[] ch = s1[i].toCharArray();
			     System.out.print(" ");
			     for(j=len-1; j >= 0; j--)
			    	 System.out.print(ch[j]);
			     
			}
			else
			{
				System.out.print(" " + s1[i]); 
			}
		}
		
		
		
	
	}

}
