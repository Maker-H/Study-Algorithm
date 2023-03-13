// https://www.acmicpc.net/problem/9498

package sec02_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02_ConvertScores_9498 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println((num>=90)? "A" : (num>=80)? "B" : (num>=70)? "C" : (num>=60)? "D" : "F");
    }
}