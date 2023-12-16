package 백준.단계별로_풀어보기_4to11.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.Arrays;

public class 백준_직사각형에서_탈출_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int x = input[0];
        int y = input[1];
        int w = input[2];
        int h = input[3];

        int ans = Math.min(Math.min(x, (w - x)), Math.min(y, (h - y)));
        System.out.println(ans);
        bw.flush();
    }
}
