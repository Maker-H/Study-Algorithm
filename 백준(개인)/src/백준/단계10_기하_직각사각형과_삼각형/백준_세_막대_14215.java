package 백준.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class 백준_세_막대_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ABC = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(ABC);

        int a = ABC[0];
        int b = ABC[1];
        int c = ABC[2];

        if (c < b + a) {
            System.out.println(a + b + c);
        } else {
            c = b + a - 1;
            System.out.println(c + a + b);
        }

    }
}
