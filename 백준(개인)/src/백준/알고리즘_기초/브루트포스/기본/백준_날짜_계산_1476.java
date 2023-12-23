package 백준.알고리즘_기초.브루트포스.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class 백준_날짜_계산_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int cnt = 0;
        int E = 0;
        int S = 0;
        int M = 0;
        while (true) {
            E++;
            S++;
            M++;
            cnt++;

            if (E > 15) {
                E = 1;
            }
            if (S > 28) {
                S = 1;
            }
            if (M > 19) {
                M = 1;
            }

            if (arr[0] == E && arr[1] == S && arr[2] == M) {
                System.out.println(cnt);
                return;
            }
        }

    }

}

