
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] inputs = new int[N * N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = N * i; j < N * i + N; j++) {
				if (st.hasMoreTokens()) {
					inputs[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		Arrays.sort(inputs);
		System.out.println(inputs[N * N - N]);
	}
	
}