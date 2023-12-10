package 백준.단계5_문자열;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 백준_문자와_문자열_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] S = br.readLine().split("");
        int i = Integer.parseInt(br.readLine());

        bw.write(S[i - 1]);
        bw.flush();
    }

}

