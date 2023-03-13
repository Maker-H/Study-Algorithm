// https://www.acmicpc.net/problem/10952

/*
 * Through this question, I learned how to use code charAt. For earlier question Q10, using System.in.rea() was the way to make code neater because the input range was between 1 to 10,000. In that case, using charAt would be a trickier way. 
 * 
 * But in this question(Q11). Input range is between 1 to 9. It means there is no tenths place. So It is neater to use charAt.
 */
package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11_AddUntilZero_Improved_10952 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(true){
            a = str.charAt(0);
            b = str.charAt(3);
            if(a==0 && b==0) {
                break;
            }
            sb.append(a+b).append('\n');
        }
        System.out.print(sb);
        
    }

   
}
