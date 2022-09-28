// https://www.acmicpc.net/problem/10950
package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q02_PrintAsManyAsIWant_Improved_10950 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int put = Integer.parseInt(br.readLine());
        int a,b;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<put;i++){
            String str = br.readLine();
            StringTokenizer st= new StringTokenizer(str," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}
