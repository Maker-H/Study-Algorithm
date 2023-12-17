package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_큐_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<String> queue = new LinkedList<>();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    queue.add(input[1]);
                    break;

                case "pop":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                        continue;
                    }
                    String poll = queue.poll();
                    bw.write(poll + "\n");
                    break;

                case "size":
                    bw.write(queue.size() + "\n");
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;

                case "front":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                        continue;
                    }
                    String peek = queue.peek();
                    bw.write(peek + "\n");
                    break;

                case "back":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                        continue;
                    }
                    String last = ((LinkedList<String>) queue).getLast();
                    bw.write(last + "\n");
                    break;
            }
        }
        bw.flush();
    }
}
