package 백준.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 백준_네_번째_점_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> col = new HashMap<>();
        HashMap<Integer, Integer> row = new HashMap<>();

        for (int n = 0; n < 3; n++) {
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            row.put(input[0], row.getOrDefault(input[0], 0) + 1);
            col.put(input[1], col.getOrDefault(input[1], 0) + 1);
        }

        int ansRow = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : row.entrySet()) {
            if (integerIntegerEntry.getValue().equals(1)) {
                ansRow = integerIntegerEntry.getKey();
            }
        }

        int ansCol = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : col.entrySet()) {
            if (integerIntegerEntry.getValue().equals(1)) {
                ansCol = integerIntegerEntry.getKey();
            }
        }
        System.out.println(ansRow + " " + ansCol);

        bw.flush();
    }
}
