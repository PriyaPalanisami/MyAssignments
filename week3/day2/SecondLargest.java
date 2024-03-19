package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	
	public static void main(String[] args) {
			int[] arr1 = {3, 2, 11, 4, 6, 7};
			List<Integer> list1 = new ArrayList<Integer>();
			for (int i = 0; i < arr1.length; i++) {
				list1.add(arr1[i]);
			}
			int len = list1.size();
			System.out.println("The size of list: " + len);
			
			Collections.sort(list1);
			System.out.println(list1);
			System.out.println("The second largest number in the List: " + list1.get(len-2));
			
	}
}
