package 백준.단계9_약수배수와소수;

import java.io.*;
import java.util.Arrays;

public class 백준_약수_구하기_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = input[0];
        int K = input[1];

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                ans++;
            }
            if (ans == K) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}
