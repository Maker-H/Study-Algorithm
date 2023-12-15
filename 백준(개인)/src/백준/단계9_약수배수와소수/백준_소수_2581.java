package 백준.단계9_약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 백준_소수_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        if (M == 1) {
            M = 2;
        }

        int min = 1;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                if (min == 1) {
                    min = i;
                }
                sum += i;
                System.out.println(i);
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
