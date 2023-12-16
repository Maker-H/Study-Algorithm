package 백준.단계별로_풀어보기_4to11.단계5_문자열;

import java.io.*;
import java.util.HashMap;
import java.util.stream.IntStream;

public class 백준_알파벳_찾기_10890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> alphaMap = new HashMap<>();
        // a~z = 97~122

        IntStream.rangeClosed(97, 122)
                .forEach(n -> alphaMap.put(String.valueOf((char) n), -1));

        String[] S = br.readLine().split("");
        for (int i = 0; i < S.length; i++) {
            if (alphaMap.get(S[i]) == -1) {
                alphaMap.put(S[i], i);
            }
        }

        for (Integer value : alphaMap.values()) {
            bw.write(String.valueOf(value) + " ");
        }
        bw.flush();
    }

}

