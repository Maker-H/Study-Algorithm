package 백준.단계4_1차원배열;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 백준_평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> scores = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt) // IntStream이 됨
                .boxed() // Collector는 참조형 객체만 다룸
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(scores, Collections.reverseOrder());

        double M = scores.get(0);

        double total = scores.stream().mapToDouble(n -> n / M * 100).sum();

        bw.write(String.valueOf(total / N));


        bw.flush();
    }

}


/*
ArrayList<Integer> list = new ArrayList<Integer>();
Collections.sort(list); // 오름차순
Collections.sort(list, Collections.reverseOrder()); // 내림차순

<stream 사용해서 새로운 배열 생성>
List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
 */
