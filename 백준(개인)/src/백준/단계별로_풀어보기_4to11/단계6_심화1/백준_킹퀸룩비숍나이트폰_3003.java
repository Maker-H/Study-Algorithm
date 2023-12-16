package 백준.단계별로_풀어보기_4to11.단계6_심화1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 백준_킹퀸룩비숍나이트폰_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i : IntStream.rangeClosed(0, 5).toArray()){
            bw.write(chess[i] - input[i] + " ");
        }

        bw.flush();
    }

}

