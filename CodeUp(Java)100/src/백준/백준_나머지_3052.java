package 백준;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백준_나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int remain = Integer.parseInt(br.readLine()) % 42;
            map.put(remain, map.getOrDefault(remain, -1) + 1);
        }
        bw.write(String.valueOf(map.size()));
        bw.flush();
    }

}

