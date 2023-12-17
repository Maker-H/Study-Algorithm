package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class 백준_에디터_Stack사용_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> store = Arrays.stream(br.readLine().split(""))
                .collect(Collectors.toCollection(Stack::new));
        Stack<String> ans = new Stack<>();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "L":
                    if (store.size() == 0) {
                        continue;
                    }
                    String pop = store.pop();
                    ans.push(pop);
                    break;
                case "D":
                    if (ans.size() == 0) {
                        continue;
                    }
                    String tmp = ans.pop();
                    store.push(tmp);
                    break;
                case "B":
                    if (store.size() == 0) {
                        continue;
                    }
                    store.pop();
                    break;
                case "P":
                    store.push(input[1]);
                    break;
            }


        }
        String tmp = "";
        while (!ans.empty()) {
            store.push(ans.pop());
        }
        bw.write(String.join("", store));

        bw.flush();


    }
}
