// https://www.acmicpc.net/problem/10951

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12_AddUntilEOF_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str  = br.readLine();
            if(str==null){
                break;
            }
            int a = str.charAt(0)-48;
            int b = str.charAt(2)-48;

            sb.append(a+b).append('\n');
            
        }
        System.out.print(sb);
    }    
}
