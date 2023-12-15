package 백준.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.Arrays;

public class 백준_삼각형과_세_변_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Arrays.sort(input);

            int a = input[0];
            int b = input[1];
            int c = input[2];

            if (a == 0 && c == 0) {
                return;
            }

            if (c >= a + b){
                System.out.println("Invalid");
            } else if (a == b && b == c && c == a) {
                System.out.println("Equilateral");
            } else if (a != b && b != c && c != a) {
                System.out.println("Scalene");
            } else if ((a == b && b != c) || (a != b && b == c)) {
                System.out.println("Isosceles");
            }
        }

    }
}
