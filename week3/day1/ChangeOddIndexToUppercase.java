package week3.day1;

public class ChangeOddIndexToUppercase {

		public static void main(String[] args) {
			
			String s = "changeme";
			System.out.println("The given string is: " + s);
			
			char[] ch = s.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				if(i%2!=0)
					ch[i]=Character.toUpperCase(ch[i]);
			}
			System.out.println("The Output string is: ");
			for (char c : ch) {
				System.out.print(c);
			}
		}
}
