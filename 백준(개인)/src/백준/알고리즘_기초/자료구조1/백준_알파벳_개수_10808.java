package 백준.알고리즘_기초.자료구조1;

import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class 백준_알파벳_개수_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        //초기화
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            map.put(String.valueOf((char) i), 0);
        }

        String[] input = br.readLine().split("");
        for (String s : input) {
            map.put(s, map.get(s) + 1);
        }

        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            sb.append(map.get(String.valueOf((char) i)) + " ");
        }

        System.out.println(sb);
    }
}
