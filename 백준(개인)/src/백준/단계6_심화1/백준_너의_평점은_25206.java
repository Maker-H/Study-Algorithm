package 백준.단계6_심화1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 백준_너의_평점은_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Float> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5F);
        gradeMap.put("A0", 4.0F);
        gradeMap.put("B+", 3.5F);
        gradeMap.put("B0", 3.0F);
        gradeMap.put("C+", 2.5F);
        gradeMap.put("C0", 2.0F);
        gradeMap.put("D+", 1.5F);
        gradeMap.put("D0", 1.0F);
        gradeMap.put("F", 0.0F);

        float totalScore = 0;
        float totalScoreMulGrade = 0;
        for (int t = 0; t < 20; t++) {
            String[] input = br.readLine().split(" ");
            float score = Float.parseFloat(input[1]);

            if (input[2].equals("P")) {
                continue;
            }

            float grade = gradeMap.get(input[2]);

            totalScore += score;
            totalScoreMulGrade = score * grade + totalScoreMulGrade;
        }

        bw.write(String.valueOf(totalScoreMulGrade / totalScore));
        bw.flush();
    }

}

