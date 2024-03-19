package week3.day2;

import java.util.ArrayList;
import java.util.List;


public class ListInterfaceIntersection {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0 ; j < arr2.length; j++) {
				if (list1.get(i)==list2.get(j)) {
					System.out.println("The same element in both list: " + list1.get(i));
				}
					
			}
			
		}
		
				
	}
}
