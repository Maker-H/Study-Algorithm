package 백준.단계10_기하_직각사각형과_삼각형;

import java.io.*;
import java.util.Arrays;

public class 백준_대지_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());
        if (T == 1) {
            System.out.println("0");
            return;
        }

        int rowMin = 100000;
        int rowMax = -100000;
        int colMin = 100000;
        int colMax = -100000;
        for (int i = 0; i < T; i++) {
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (input[0] > rowMax) {
                rowMax = input[0];
            }
            if (input[0] < rowMin) {
                rowMin = input[0];
            }
            if (input[1] > colMax) {
                colMax = input[1];
            }
            if (input[1] < colMin) {
                colMin = input[1];
            }
        }

        if (rowMax == rowMin || colMax == colMin) {
            System.out.println("0");
            return;
        }
        System.out.println((rowMax - rowMin) * (colMax - colMin));
    }
}
