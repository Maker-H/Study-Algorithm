package 백준.단계별로_풀어보기_4to11.단계7_2차원배열;

import java.io.*;
import java.util.Arrays;

public class 백준_행렬덧셈_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = inputSize[0];
        int M = inputSize[1];

        int[][] arr1 = new int[N][M];
        for (int n = 0; n < N; n++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr1[n] = tmp;
        }

        int[][] arr2 = new int[N][M];
        for (int n = 0; n < N; n++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr2[n] = tmp;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(String.valueOf(arr1[i][j] + arr2[i][j]) + " ");
            }
            bw.write("\n");
        }

        bw.flush();
    }

}

