package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;

public class 백준_오등큰수_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : input) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            if (stack.empty()) {
                stack.push(i);
            } else {
                if (map.get(input[stack.peek()]) < map.get(input[i])) {
                    while (map.get(input[stack.peek()]) < map.get(input[i])) {
                        input[stack.pop()] = input[i];
                        if (stack.isEmpty()) break;
                    }
                    stack.push(i);
                } else {
                    stack.push(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            input[stack.pop()] = -1;
        }

        sb.append(Arrays.stream(input)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining(" ")));

        System.out.println(sb);
    }
}
