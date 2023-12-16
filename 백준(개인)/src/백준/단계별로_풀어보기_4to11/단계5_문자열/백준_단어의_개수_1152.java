package 백준.단계별로_풀어보기_4to11.단계5_문자열;

import java.io.*;

public class 백준_단어의_개수_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().strip();
        if (input.length() == 0) {
            bw.write("0");
            bw.flush();
            return;
        }
        bw.write(String.valueOf(input.split(" ").length));
        bw.flush();
    }

}

