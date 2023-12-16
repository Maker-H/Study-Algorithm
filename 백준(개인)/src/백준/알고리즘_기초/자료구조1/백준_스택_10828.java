package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 백준_스택_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> arr = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            switch (cmd) {
                case "push":
                    arr.add(input[1]);
                    break;

                case "pop":
                    if (arr.size() == 0) {
                        System.out.println("-1");
                    } else {
                        String remove = arr.remove(arr.size() - 1);
                        System.out.println(remove);
                    }
                    break;

                case "size":
                    System.out.println(arr.size());
                    break;

                case "empty":
                    if (arr.size() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;

                case "top":
                    if (arr.size() == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println(arr.get(arr.size() - 1));
                    }
                    break;

            }
        }
    }
}
