package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		Collections.sort(list1);
		System.out.println("The given array is: ");
		System.out.println(list1);
		System.out.println("The missing element in the given array: ");
		int k = 1;
		for (int i = 0; i <= list1.size(); i++, k++) {
			
			if(list1.get(i)!= k)
			{
				System.out.println(k);
				--i;
				
			}
		}
	}
}
