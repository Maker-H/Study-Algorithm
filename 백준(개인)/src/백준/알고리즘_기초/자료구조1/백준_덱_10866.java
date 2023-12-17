package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<String> ans = new LinkedList<>();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            String tmp = "";
            switch (input[0]) {
                case "push_front":
                    ans.addFirst(input[1]);
                    break;

                case "push_back":
                    ans.add(input[1]);
                    break;

                case "pop_front":
                    if (ans.isEmpty()) {
                        bw.write("-1\n");
                        continue;
                    }
                    tmp = ans.poll();
                    bw.write(tmp + "\n");
                    break;

                case "pop_back":
                    if (ans.isEmpty()) {
                        bw.write("-1\n");
                        continue;
                    }
                    tmp = ans.pollLast();
                    bw.write(tmp + "\n");
                    break;

                case "size":
                    bw.write(String.valueOf(ans.size()) + "\n");
                    break;

                case "empty":
                    if (ans.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;

                case "front":
                    if (ans.isEmpty()) {
                        bw.write("-1\n");
                        continue;
                    }
                    bw.write(ans.getFirst() + "\n");
                    break;

                case "back":
                    if (ans.isEmpty()) {
                        bw.write("-1\n");
                        continue;
                    }
                    bw.write(ans.getLast() + "\n");
                    break;
            }
        }

        bw.flush();
    }
}
