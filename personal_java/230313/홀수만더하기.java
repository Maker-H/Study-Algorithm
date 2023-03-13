import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			int sum = 0;
			
			for (int i = 0; i < 10; i++) {
				int tmp = sc.nextInt();
				if (tmp % 2 == 1) {					
					sum += tmp;
				}
			}
			
			System.out.printf("#%d %d\n", test_case + 1, sum);
		}
	}
}
