package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_단어_뒤집기_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            for (String word : input) {
                char[] wordArr = word.toCharArray();
                for (int i = wordArr.length - 1; i >= 0; i--) {
                    bw.write(wordArr[i]);
                }
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}
