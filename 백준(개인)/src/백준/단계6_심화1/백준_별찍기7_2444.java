package 백준.단계6_심화1;

import java.io.*;

public class 백준_별찍기7_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int star = 1;
        int blank = N - 1;
        for (int i = 1; i < 2 * N; i++) {
            // 빈칸 찍기
            for (int j = blank; j > 0; j--){
                bw.write(" ");
            }
            // 별 찍기
            for (int j = 0; j < star; j++){
                bw.write("*");
            }
            // 빈칸 찍기
            bw.write("\n");
            if (i >= N) {
                blank++;
                star -= 2;
            } else {
                blank--;
                star = star + 2;
            }

        }

        bw.flush();
    }

}

