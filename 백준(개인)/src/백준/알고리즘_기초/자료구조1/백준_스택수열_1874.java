package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백준_스택수열_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder bw = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Queue<Integer> input = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();


        for (int t = 0; t < T; t++) {
            input.add(Integer.parseInt(br.readLine()));
        }


        for (int i = 1; i <= T; i++) {
            if (i <= input.peek()) {
                stack.add(i);
                bw.append("+\n");
                while (stack.size() != 0 && stack.peek().equals(input.peek())) {
                    input.poll();
                    stack.pop();
                    bw.append("-\n");
                }
            }
        }

        while (stack.size() != 0 && stack.peek().equals(input.peek())) {
            input.poll();
            stack.pop();
            bw.append("-\n");
        }

        if (stack.size() != 0) {
            System.out.println("NO");
        } else {
            System.out.println(bw);
        }
    }
}
