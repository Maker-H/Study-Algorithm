package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 백준_접미사_배열_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split("");

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String tmp = "";
            for (int j = i; j < input.length; j++) {
                tmp += input[j];
            }
            arr.add(tmp);
        }

        arr.sort((a, b) -> a.compareTo(b));
        for (String s : arr) {
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }

}

