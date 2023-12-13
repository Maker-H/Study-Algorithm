package 백준.단계5_문자열;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;


public class 백준_다이얼_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자-전화상번호 저장
        HashMap<String, Integer> stToPhone = new HashMap<>();
        int start = 2;
        for (int i = 65; i < 80; i += 3) {
            for (int j = i; j < i + 3; j++) {
                stToPhone.put(String.valueOf((char) j), start);
            }
            start += 1;
        }
        Arrays.stream("TUV".split("")).forEach(s -> stToPhone.put(s, 8));
        Arrays.stream("PQRS".split("")).forEach(s -> stToPhone.put(s, 7));
        Arrays.stream("WXYZ".split("")).forEach(s -> stToPhone.put(s, 9));

        // 전화상번호-걸리는시간 저장
        HashMap<Integer, Integer> phoneToTime = new HashMap<>();
        IntStream.rangeClosed(2, 9).forEach(i -> phoneToTime.put(i, i + 1));

        int ans = Arrays.stream(br.readLine().strip().split(""))
                .mapToInt(s -> phoneToTime.get(stToPhone.get(s)))
                .sum();

        bw.write(String.valueOf(ans));
        bw.flush();
    }

}

