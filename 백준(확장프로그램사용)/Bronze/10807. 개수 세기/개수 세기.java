import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int v = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int num : nums) {
            if (num == v) {
                ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();

    }
}

