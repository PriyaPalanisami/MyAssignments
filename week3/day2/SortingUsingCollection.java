package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	 public static void main(String[] args) {
		
		 String[] s = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		 List<String> list1 = new ArrayList<String>();
		 for (String each : s) {
			 
			 list1.add(each);
			
		}
		System.out.println("The list before sorting: " + list1);
		Collections.sort(list1);
		System.out.println("The list after sorting: " + list1);
		System.out.println("The list in descending order: ");
		for (int i = list1.size()-1; i >= 0; --i) {
				System.out.print("   " + list1.get(i));
		}
	 }	 
	
}
