
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		
		int N = Integer.parseInt(inputs[0]);
		int K = Integer.parseInt(inputs[1]);
		
		int[][] item = new int[N + 1][2]; // 무게, 가치
		
		for (int i = 1; i <= N; i++) {
			inputs = br.readLine().split(" ");
			item[i][0] = Integer.parseInt(inputs[0]);
			item[i][1] = Integer.parseInt(inputs[1]);
		}
		
		int[][] dp = new int[N + 1][K + 1]; // item, 무게
		
		for (int k = 1; k <= K; k++) { // 무게
			for (int i = 1; i <= N; i++) { // item
				dp[i][k] = dp [i - 1][k];
				if (k - item[i][0] >= 0) {
					// 전과, 지금 가치 + 목적 무게에서 자기자신 무게 뺀 겻
					dp[i][k] = Math.max(dp[i - 1][k],  item[i][1] + dp[i - 1][k - item[i][0]]);
				}
			}
		}
		
		System.out.println(dp[N][K]);
	}
}