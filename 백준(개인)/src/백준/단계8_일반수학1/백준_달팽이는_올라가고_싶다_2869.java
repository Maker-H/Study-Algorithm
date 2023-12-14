package 백준.단계8_일반수학1;

import java.io.*;
import java.util.Arrays;

public class 백준_달팽이는_올라가고_싶다_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int A = input[0];
        int B = input[1];
        int V = input[2];

        int ans = (int) Math.ceil(((double) V - A) / (A - B)) + 1;
        System.out.println(ans);

    }
}
