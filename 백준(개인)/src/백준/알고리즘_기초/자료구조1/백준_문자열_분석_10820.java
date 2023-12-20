package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 백준_문자열_분석_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = "";
        while ((N = br.readLine()) != "\n") {
            String[] input = N.split("");

            int low = 0;
            int high = 0;
            int blank = 0;
            int num = 0;
            for (int i = 0; i < input.length; i++) {
                String s = input[i];

                if (s.equals(" ")) {
                    blank++;
                } else if ((int) '0' <= (int) N.charAt(i) && (int) N.charAt(i) <= (int) '9') {
                    num++;
                } else if (s.equals(s.toLowerCase())) {
                    low++;
                } else if (s.equals(s.toUpperCase())) {
                    high++;
                }
            }

            System.out.printf("%d %d %d %d\n", low, high, num, blank);
        }
    }
}
