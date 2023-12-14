package 백준.단계8_일반수학1;

import java.io.*;

public class 백준_벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int count = 1;
        int start = 2;
        while (true) {
            int range = count * 6;
            if (start <= N && N <= (start + range - 1)) {
                bw.write(String.valueOf(count + 1));
                bw.flush();
                return;
            }
            start += range;
            count++;
        }

    }
}
