// https://www.acmicpc.net/problem/2739

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Q1_MultiplicationTable_2739 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(bf.readLine());
        for(int i=0;i<10;i++) {
            System.out.println(j+" * "+i+" = "+j*i);
        }
    }
}
