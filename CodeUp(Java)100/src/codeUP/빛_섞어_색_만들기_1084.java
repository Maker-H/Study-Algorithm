package codeUP;

import java.io.*;
import java.util.Scanner;

public class 빛_섞어_색_만들기_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    bufferedWriter.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bufferedWriter.write(String.valueOf(a * b * c));
        bufferedWriter.flush();
    }
}

