package 백준.단계별로_풀어보기_4to11.단계8_일반수학1;

import java.io.*;

public class 백준_중앙_이동_알고리즘_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        int ans = 4;
        int oneLine = 3;
        while (N > 0) {
            ans = oneLine * oneLine;
            oneLine = (oneLine - 1) * 2 + 1;
            N--;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
    }
}
