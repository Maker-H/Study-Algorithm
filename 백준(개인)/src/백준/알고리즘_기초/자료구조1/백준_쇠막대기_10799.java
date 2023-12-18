package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class 백준_쇠막대기_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int stack = 0;

        String[] input = br.readLine().split("");
        int i = 0;
        int ans = 0;
        while (i < input.length) {
            if (input[i].equals("(") && input[i + 1].equals(")")) {
                ans += stack;
                i+=2;
                continue;
            } else if (input[i].equals("(")) {
                stack++;
            } else if (input[i].equals(")")) {
                ans++;
                stack--;
            }
            i++;
        }

        System.out.println(ans);
    }
}
