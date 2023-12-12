package 백준.단계7_2차원배열;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 백준_최댓값_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int maxRow = 1;
        int maxCol = 1;
        for (int n = 0; n < 9; n++) {
            ArrayList<Integer> tmp = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));

            ArrayList<Integer> sortedTmp = new ArrayList<>(tmp);

            sortedTmp.sort(Comparator.reverseOrder());

            if (sortedTmp.get(0) <= max) {
                continue;
            }

            max = sortedTmp.get(0);
            maxCol = tmp.indexOf(max) + 1;
            maxRow = n + 1;
        }

        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(maxRow) + " " + String.valueOf(maxCol));
        bw.flush();
    }

}

