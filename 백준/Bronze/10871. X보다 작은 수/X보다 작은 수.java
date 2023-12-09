import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] NX = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = NX[0];
        int X = NX[1];

        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (num < X) {
                ans.add(num);
            }
        }

        bw.write(String.join(" ", ans.stream().map(Object::toString).toArray(String[]::new)));
        bw.flush();
    }

}

