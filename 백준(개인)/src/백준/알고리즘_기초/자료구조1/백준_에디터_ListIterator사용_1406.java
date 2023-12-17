package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class 백준_에디터_ListIterator사용_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        LinkedList<String> arr = Arrays.stream(br.readLine().split(""))
                .collect(Collectors.toCollection(LinkedList::new));

        int M = Integer.parseInt(br.readLine());
        /*
         | a | b | c | d |
         처럼 listIterator는 커서처럼 각 중간 지점을 가리키고 맨 마지막에서 previous()하면 d로 감
         */
        ListIterator<String> listIterator = arr.listIterator(arr.size());


        for (int t = 0; t < M; t++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "L":
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    break;

                case "D":
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    }
                    break;
                case "B":
                    /*
                        remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거
                     */
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                        listIterator.remove();
                    }
                    break;
                case "P":
                    /*
                        맨 마지막에 가리킨 자리에 넣고 원래 있던 건 뒤로 민다
                     */
                    listIterator.add(input[1]);
                    break;
            }
        }

        bw.write(String.join("", arr));
        bw.flush();
    }
}
