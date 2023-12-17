package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class 백준_괄호_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            Stack<String> stack = new Stack<>();
            LinkedList inputStack = Arrays.stream(br.readLine().split(""))
                    .collect(Collectors.toCollection(LinkedList::new));

            boolean flag = false;
            while (inputStack.size() != 0) {
                if (inputStack.getFirst().equals("(")) {
                    stack.push("(");
                    inputStack.poll();
                } else if (inputStack.getFirst().equals(")")) {
                    if (stack.size() == 0) {
                        flag = true;
                        break;
                    } else if (stack.peek().equals("(")) {
                        stack.pop();
                        inputStack.poll();
                    } else {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag || stack.size() != 0) {
                bw.write("NO\n");
            } else {
                bw.write("YES\n");
            }
        }


        bw.flush();
    }
}
