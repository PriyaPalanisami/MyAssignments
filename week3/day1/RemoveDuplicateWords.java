package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String s = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] s1 = s.split(" ");
		System.out.println("The given string: " + s);
		System.out.println("Strings after splitting into words: ");
		for (String each : s1) {
			System.out.print("    " + each);
		}
		for (int i = 0; i < s1.length; i++) {
			for (int j = i+1; j < s1.length; j++) {
				if (s1[i].equalsIgnoreCase(s1[j])) {
					s1[j]="    ";
					count=count+1;
				}
					
			}
		}
		if (count>1) {
			System.out.println("");
			System.out.println("Output: ");
			for (String each : s1) {
				System.out.print("    " + each);
			}	
		}
		
		}
}
