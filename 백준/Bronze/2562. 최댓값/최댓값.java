import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i <= 9; i++) {
            int target = Integer.parseInt(br.readLine());
            if (target > max) {
                max = target;
                maxIndex = i;
            }
        }
        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(maxIndex));
        bw.flush();
    }

}

