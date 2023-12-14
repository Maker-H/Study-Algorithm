package 백준.단계8_일반수학1;

import java.io.*;
import java.util.Arrays;

public class 백준_진법변환_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int ans = Integer.parseInt(input[0], Integer.parseInt(input[1]));

        bw.write(String.valueOf(ans));

        bw.flush();
    }
}
