package 백준.단계별로_풀어보기_4to11.단계7_2차원배열;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백준_색종이_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(100);

        for (int n = 0; n < 100; n++) {
            ArrayList<Integer> initial = IntStream
                    .generate(() -> 0)
                    .limit(100)
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));

            arr.add(initial);
        }

        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int squareCol = input[0];
            int squareRow = input[1];

            for (int i = squareRow; i < squareRow + 10; i++) {
                for (int j = squareCol; j < squareCol + 10; j++) {
                    arr.get(i).set(j, 1);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr.get(i).get(j).equals(1)) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
    }

}

