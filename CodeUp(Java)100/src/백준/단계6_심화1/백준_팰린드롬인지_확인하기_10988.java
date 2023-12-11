package 백준.단계6_심화1;

import java.io.*;
import java.util.stream.IntStream;

public class 백준_팰린드롬인지_확인하기_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        String[] input_reverse
                = IntStream.rangeClosed(0, input.length - 1)
                .mapToObj(i -> input[input.length - 1 - i])
                .toArray(String[]::new);

        boolean is_pal = true;
        for (int i : IntStream.rangeClosed(0, input.length - 1).toArray()) {
            if (!input_reverse[i].equals(input[i])) {
                is_pal = false;
                break;
            }
        }

        if (is_pal) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
    }

}

