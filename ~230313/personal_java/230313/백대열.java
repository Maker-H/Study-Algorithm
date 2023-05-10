import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		
		String [] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(":");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int _max;
		int _min;
		if (m > n){
			_max = m; 
			_min = n;
		} else {
			_max = n;
			_min = m;
		}
		
		int result = gcd(_min, _max);
		System.out.println(n/result + ":" + m/result);
	}
	
	static int gcd(int n, int m) {
		if (n == 0) {
			return m;
		}
		
		return gcd(m % n, n);
	}
}