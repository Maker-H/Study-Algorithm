// https://www.acmicpc.net/problem/8393


package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_GetSum_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int sum=0;
        while(num!=0){
            sum+=num;
            num--;
        }
        System.out.print(sum);
        
    }
}
