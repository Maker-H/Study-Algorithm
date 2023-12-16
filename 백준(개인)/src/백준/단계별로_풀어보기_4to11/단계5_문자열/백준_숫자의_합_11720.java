package 백준.단계별로_풀어보기_4to11.단계5_문자열;

import java.io.*;
import java.util.Arrays;

public class 백준_숫자의_합_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = Arrays.stream(br.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        bw.write(String.valueOf(sum));
        bw.flush();
    }

}

