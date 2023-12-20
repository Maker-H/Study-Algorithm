package 백준.알고리즘_기초.자료구조1;

import java.io.*;

public class 백준_ROT13_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] S = br.readLine().toCharArray();

        for (char c : S) {
            if (((int) 'a' <= (int) c && (int) c <= (int) 'z') || ((int) 'A' <= (int) c && (int) c <= (int) 'Z')) {

                if (String.valueOf(c).toLowerCase().equals(String.valueOf(c))) {
                    sb.append((char) (((int) c - (int) 'a' + 13) % 26 + (int) 'a'));
                } else {
                    sb.append((char) (((int) c - (int) 'A' + 13) % 26 + (int) 'A'));
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);

    }

}

