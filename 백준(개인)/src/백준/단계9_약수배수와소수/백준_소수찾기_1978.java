package 백준.단계9_약수배수와소수;

import java.io.*;
import java.util.Arrays;

public class 백준_소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int cnt = 0;
        for (int i : input) {
            if (i == 1) {
                continue;
            }

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
