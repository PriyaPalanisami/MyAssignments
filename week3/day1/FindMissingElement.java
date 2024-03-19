package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] a = {1,4,3,2,8,6,7};
		System.out.println("The given unsorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("   " + a[i]);
		}
		
		Arrays.sort(a);
		System.out.println(" ");
		System.out.println("The sorted array: ");
		for(int i=0;i<a.length;i++)
			System.out.print("   " + a[i]);
		
		System.out.println(" ");
		System.out.println("The missed element: ");
		for (int j = 0; j < a.length; j++) {
			if(a[j] != j+1)
			{
				System.out.println(j+1);break; 	   
			}
						
		}
	}
}
