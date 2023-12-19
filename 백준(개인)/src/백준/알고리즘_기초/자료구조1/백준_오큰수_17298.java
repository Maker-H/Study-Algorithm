package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class 백준_오큰수_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (input[i] > input[stack.peek()]) {
                    while (input[stack.peek()] < input[i]) {
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
