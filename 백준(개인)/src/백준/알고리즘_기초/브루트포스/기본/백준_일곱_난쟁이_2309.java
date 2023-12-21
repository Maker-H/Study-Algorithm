package 백준.알고리즘_기초.브루트포스.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 백준_일곱_난쟁이_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] heights = new int [9];

        int sum = 0;
        for (int t = 0; t < 9; t++) {
            heights[t] = Integer.parseInt(br.readLine());
            sum += heights[t];
        }

        loop:
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if ((sum - heights[i] - heights[j]) == 100) {
                    heights[i] = -1;
                    heights[j] = -1;
                    break loop;
                }
            }
        }

        Arrays.sort(heights);
        for (int height : heights) {
            if (height == -1) {
                continue;
            }
            sb.append(height + "\n");
        }

        System.out.println(sb);

    }

}

