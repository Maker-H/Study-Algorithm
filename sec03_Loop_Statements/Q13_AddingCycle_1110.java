//https://www.acmicpc.net/problem/1110

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Q13_AddingCycle_1110 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int count=0; //숫자 세기
        Buffered

        while(num != (a*10+b)) {
            if(b == -38){
                b = a;
                a = 0;
                sb.append(b).append(b);
            } else {
                if(a+b>10) {
                    sb.append(a + b + (a*10+b));
                } else {
                    sb.append(b).append(a+b);
                }
            }
            a=sb.charAt(1);
            count++;
            System.out.println("count : "+count+" a : "+a+" b : "+b+" sb : "+sb);
            num = Integer.parseInt(sb.toString());
            sb = null;
        }   
        System.out.println(count);

        
    }

    public static int read(String str) {
        int num = Integer.parseInt(str);
        if()
    }

}
