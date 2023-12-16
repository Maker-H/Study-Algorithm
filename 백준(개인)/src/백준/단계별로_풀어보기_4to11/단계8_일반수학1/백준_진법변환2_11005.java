package 백준.단계별로_풀어보기_4to11.단계8_일반수학1;

import java.io.*;

public class 백준_진법변환2_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        String ans = Integer.toString(Integer.parseInt(input[0]), Integer.parseInt(input[1])).toUpperCase();

        bw.write(ans);

        bw.flush();
    }
}
