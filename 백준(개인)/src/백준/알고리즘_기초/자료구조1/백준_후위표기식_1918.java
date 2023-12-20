package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class 백준_후위표기식_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        map.put(("("), 0);
        map.put((")"), 0);
        map.put(("/"), 2);
        map.put(("*"), 2);
        map.put(("+"), 1);
        map.put(("-"), 1);

        Stack<String> stack = new Stack<>();
        String[] input = br.readLine().split("");
        for (String s : input) {
            if (map.containsKey(s)) {
                int s_priority = map.get(s);

                if (s.equals(")")) {
                    while (!stack.peek().equals("(")) {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                } else if (s.equals("(")) {
                    stack.push("(");
                } else if (stack.isEmpty() || map.get(stack.peek()) < s_priority) {
                    stack.push(s);
                } else {
                    while (!stack.isEmpty() && map.get(stack.peek()) >= s_priority) {
                        sb.append(stack.pop());
                    }
                    stack.push(s);
                }
            } else {
                sb.append(s);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }
}
