package codeUP;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class 소리_파일_저장용량_계산하기_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long h = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        long s = Long.parseLong(input[3]);

        double mul = h * b * c * s;

        long div = (1 << 20) * 8;

        System.out.printf("%.1f MB",  mul / div);

    }
}
