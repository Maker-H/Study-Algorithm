package 백준.알고리즘_기초.자료구조1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 백준_단어_뒤집기2_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<String> input = Arrays.stream(br.readLine().split("")).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> phrases = new ArrayList<>();
        String tmp = "";
        int index = 0;
        while (index < input.size()) {
            if (input.get(index).equals("<")) {
                if (!tmp.equals("")) {
                    phrases.add(tmp);
                }
                tmp = "";
                while (!input.get(index).equals(">")) {
                    tmp += input.get(index);
                    index++;
                }
                tmp += ">";
                phrases.add(tmp);
                tmp = "";
            } else {
                tmp += input.get(index);
            }
            index++;
        }

        if (!tmp.equals("")) {
            phrases.add(tmp);
        }

        for (String phrase : phrases) {
            if (phrase.charAt(0) == '<') {
                sb.append(phrase);
            } else {
                String[] words = phrase.split(" ");
                for (String word : words) {
                    for (int i = word.length() - 1; i >= 0; i--) {
                        sb.append(word.charAt(i));
                    }
                    sb.append(" ");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        System.out.println(sb);
    }
}
