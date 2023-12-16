package 백준.단계별로_풀어보기_4to11.단계6_심화1;

import java.io.*;
import java.util.HashMap;
import java.util.stream.IntStream;

public class 백준_그룹_단어_체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int t = 0; t < T; t++) {
            HashMap<String, Integer> map = new HashMap<>();

            String[] split = br.readLine().split("");
            for (int i : IntStream.rangeClosed(0, split.length - 2).toArray()) {
                if (!split[i].equals(split[i + 1])) {
                    map.put(split[i], map.getOrDefault(split[i], 0) + 1);
                }
            }
            map.put(split[split.length - 1], map.getOrDefault(split[split.length - 1], 0) + 1);

            boolean flag = false;
            for (Integer value : map.values()) {
                if (value >= 2) {
                    flag = true;
                    break;
                }
            }

            if (flag) continue;

            ans += 1;
        }
        bw.write(String.valueOf(ans));
        bw.flush();
    }

}

