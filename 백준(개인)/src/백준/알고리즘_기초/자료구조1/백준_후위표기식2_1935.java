package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class 백준_후위표기식2_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>(N);

        String[] input = br.readLine().split("");

        char alpha = 'A';
        for (int t = 0; t < N; t++) {
            int n = Integer.parseInt(br.readLine());
            map.put(String.valueOf(alpha), n);

            alpha = (char) ((int) alpha + 1);
        }

        Stack<Double> stack = new Stack<>();
        for (String s : input) {
            if (map.containsKey(s)) { // 숫자일 때
                stack.push((double) map.get(s));
            } else { // 연산자일 때
                double i1 = stack.pop();
                double i2 = stack.pop();

                switch (s){
                    case"*":
                        stack.push(i2 * i1);
                        break;

                    case "+":
                        stack.push(i2 + i1);
                        break;

                    case "/":
                        stack.push((double) i2 / i1);
                        break;

                    case "-":
                        stack.push(i2 - i1);
                        break;
                }

            }
        }

        System.out.printf("%.2f", stack.peek());
    }
}
