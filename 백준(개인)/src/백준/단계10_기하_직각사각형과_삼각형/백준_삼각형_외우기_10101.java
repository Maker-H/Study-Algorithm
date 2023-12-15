package 백준.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.Arrays;

public class 백준_삼각형_외우기_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == b && b == c && c == 60) {
            System.out.println("Equilateral");
        } else if (a + b + c == 180 && (a == b) | (b == c) | (c == a)) {
            System.out.println("Isosceles");
        } else if (a + b + c == 180 && (a != b) && (b != c) && (c != a)) {
            System.out.println("Scalene");
        } else if (a + b + c != 180) {
            System.out.println("Error");
        }

    }
}
