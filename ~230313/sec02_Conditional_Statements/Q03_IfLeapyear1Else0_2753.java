// https://www.acmicpc.net/problem/2753

package sec02_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Q03_IfLeapyear1Else0_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //get input and convert to int type
        int year = Integer.parseInt(bf.readLine());

        if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) { //leapyear
            System.out.println("1");
        } else { //average year
            System.out.println("0");
        }
    }
}
