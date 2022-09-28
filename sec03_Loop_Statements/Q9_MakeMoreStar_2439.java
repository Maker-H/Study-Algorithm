// https://www.acmicpc.net/problem/2439

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9_MakeMoreStar_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        StringBuilder sb = new StringBuilder();

        int j;
        for(int i=0;i<num;i++) {
            for(j=num-i-1;j>0;j--){
                sb.append(" ");
            }
            for(j=0; j<=i;j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);

        
    }
}
