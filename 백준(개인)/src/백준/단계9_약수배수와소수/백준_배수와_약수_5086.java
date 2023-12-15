package 백준.단계9_약수배수와소수;

import java.io.*;
import java.util.Arrays;

public class 백준_배수와_약수_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int first = input[0];
            int second = input[1];

            if (first == 0 && second == 0) {
                break;
            }

            if (second % first == 0) {
                System.out.println("factor");
            } else if (first % second == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }

    }
}
