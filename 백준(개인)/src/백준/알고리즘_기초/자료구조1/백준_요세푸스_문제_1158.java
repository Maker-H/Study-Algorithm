package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백준_요세푸스_문제_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        LinkedList<Integer> arr = IntStream.rangeClosed(1, N).boxed().collect(Collectors.toCollection(LinkedList::new));
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt = 0;
        while (cnt != N) {
            for (int i = 0; i < K - 1; i++) {
                Integer poll = arr.poll();
                arr.add(poll);
            }
            ans.add(arr.poll());
            cnt++;
        }

        String collect = ans.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));

        bw.write("<" + collect + ">");
        bw.flush();
    }
}
