package week3.day1;

public class FindIntersection {
	
	public static void main(String[] args) {
	   int a[]={3,2,11,4,6,7};
	   int b[]={1,2,11,4,9,7};
	   for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]==b[j]) {
				System.out.println(a[i]);
			}
		}
	}
}
}
