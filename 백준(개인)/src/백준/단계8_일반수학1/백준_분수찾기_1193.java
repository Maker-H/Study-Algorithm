package 백준.단계8_일반수학1;

import java.io.*;

public class 백준_분수찾기_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int cnt = 1;
        boolean reverse = false;
        while (true) {
            for (int i = 1; i <= n; i++) {
                if (reverse && cnt == X) {
                    System.out.printf("%d/%d", i, n - i + 1);
                    return;
                } else if (!reverse && cnt == X) {
                    System.out.printf("%d/%d", n - i + 1, i);
                    return;
                }
                cnt++;
            }
            reverse = !reverse;
            n++;
        }

    }
}
