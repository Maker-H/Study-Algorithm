//https://www.acmicpc.net/problem/1110

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Q13_AddingCycle_1110 {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    int inputnum = Integer.parseInt(br.readLine());
    int num = inputnum;
    int count=0;

    do{
        num = (num%10)*10 
        + (((num%10) + (num/10)) %10);

        count++;

    }while(inputnum!=num);

    System.out.println(count);
}
}