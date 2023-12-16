package 백준.단계별로_풀어보기_4to11.단계5_문자열;

import java.io.*;
import java.util.stream.IntStream;

public class 백준_상수_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String[] A_input = input[0].split("");
        String[] B_input = input[1].split("");

        String[] A_convert = IntStream
                .rangeClosed(0, A_input.length - 1)
                .mapToObj(i -> String.valueOf(A_input[A_input.length - i - 1]))
                .toArray(String[]::new);

        int A = Integer.parseInt(String.join("", A_convert));

        String[] B_convert = IntStream
                .rangeClosed(0, B_input.length - 1)
                .mapToObj(i -> String.valueOf(B_input[B_input.length - i - 1]))
                .toArray(String[]::new);

        int B = Integer.parseInt(String.join("", B_convert));

        if (A > B) {
            bw.write(String.valueOf(A));
        } else {
            bw.write(String.valueOf(B));
        }

        bw.flush();
    }

}

