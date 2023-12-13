package 백준.단계6_심화1;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class 백준_단어_공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();
        String[] input = br.readLine().strip().split("");

        for (String s : input) {
            map.put(s.toUpperCase(), map.getOrDefault(s.toUpperCase(), 0) + 1);
        }

        if (map.size() == 1) {
            bw.write(input[0].toUpperCase());
            bw.flush();
            return;
        }

        // 정렬하는 법
        List<Map.Entry<String, Integer>> newMap = new ArrayList<>(map.entrySet());
        newMap.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        if (!newMap.get(0).getValue().equals(newMap.get(1).getValue())) {
            bw.write(newMap.get(0).getKey());
        } else {
            bw.write("?");
        }
        bw.flush();
    }

}

