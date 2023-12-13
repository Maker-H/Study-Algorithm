package 백준.단계5_문자열;

import java.io.*;

public class 백준_단어_길이_재기_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] S = br.readLine().split("");

        bw.write(String.valueOf(S.length));
        bw.flush();
    }

}

