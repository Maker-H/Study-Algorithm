package 백준.단계별로_풀어보기_4to11.단계5_문자열;

import java.io.*;

public class 백준_문자열_반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String[] S = input[1].split("");

            for (String s : S) {
                for (int j = 0; j < R; j++) {
                    bw.write(s);
                }
            }
            bw.write("\n");
        }

        bw.flush();
    }

}

