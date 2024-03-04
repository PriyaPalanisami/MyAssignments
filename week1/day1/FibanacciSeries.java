package week1.day1;

public class FibanacciSeries {
	public static void main(String[] args) {
		int f = 0, s = 1, n = 8, num = 0;
			
		for (int i = 0; i < n; i++) {
			
			if(i<2)
				System.out.println(i);
			else
			{
			num = f + s;
			f = s;
			s = num;
			System.out.println(num);
			}
		}
	}

}
