package 백준.단계5_문자열;

import java.io.*;

public class 백준_문자열_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] S = br.readLine().split("");
            bw.write(S[0] + S[S.length - 1] + "\n");
        }

        bw.flush();
    }

}

