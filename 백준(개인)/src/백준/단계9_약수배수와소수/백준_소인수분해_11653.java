package 백준.단계9_약수배수와소수;

import java.io.*;

public class 백준_소인수분해_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            return;
        }
        int cnt = 2;
        while (N != 1) {
            if (N % cnt == 0) {
                System.out.println(cnt);
                N /= cnt;
            } else {
                cnt++;
            }
        }

    }
}
