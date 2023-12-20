package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 백준_알파벳_찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        //초기화
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            map.put(String.valueOf((char) i), -1);
        }

        String[] input = br.readLine().split("");
        for (int i = 0; i < input.length; i++) {
            if (map.get(input[i]).equals(-1)) {
                map.put(input[i], i);
            }
        }

        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            sb.append(map.get(String.valueOf((char) i)) + " ");
        }

        System.out.println(sb);
    }
}
