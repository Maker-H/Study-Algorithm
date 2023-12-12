package 백준.단계7_2차원배열;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 백준_세로읽기_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<ArrayList<String>> strings = new ArrayList<ArrayList<String>>();
        for (int n = 0; n < 5; n++) {
            String input = br.readLine();
            if (input.length() < 15) {
                input += " ".repeat(15 - input.length());
            }
            ArrayList<String> tmp = Arrays.stream(input.split("")).collect(Collectors.toCollection(ArrayList::new));
            strings.add(tmp);
        }
        String ans = "";
        loop:
        for (int i = 0; i < 15; i++) {
            int countBlank = 0;
            for (int j = 0; j < 5; j++) {

                String tmpAns = strings.get(j).get(i);
                if (tmpAns.equals(" ")) {
                    countBlank++;
                    if (countBlank == 5) {
                        break loop;
                    }
                    continue;
                }

                ans += tmpAns;
            }
        }
        System.out.println(ans);
        bw.flush();
    }

}

