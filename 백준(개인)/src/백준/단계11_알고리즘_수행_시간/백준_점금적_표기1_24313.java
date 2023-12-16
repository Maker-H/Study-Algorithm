package 백준.단계11_알고리즘_수행_시간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class 백준_점금적_표기1_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] f_in = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int f_in_1 = f_in[0];
        int f_in_2 = f_in[1];

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if ((c - f_in_1) > 0) {
            if ((double) f_in_2 / (c - f_in_1) > n0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else if ((c - f_in_1) == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
