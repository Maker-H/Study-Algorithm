package 백준.단계9_약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 백준_약수들의_합_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        while (!(s = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(s);

            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                bw.write(String.valueOf(n) + " = ");
                for (Integer i : arr) {
                    bw.write(String.valueOf(i));

                    if (arr.indexOf(i) == arr.size() - 1) {
                        continue;
                    }
                    bw.write(" + ");
                }
            } else {
                bw.write(String.valueOf(n) + " is NOT perfect.");
            }

            bw.write("\n");
        }
        bw.flush();
    }
}
