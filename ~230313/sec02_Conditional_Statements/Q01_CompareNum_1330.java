// https://www.acmicpc.net/problem/1330

package sec02_Conditional_Statements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Q01_CompareNum_1330 {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    StringTokenizer st = new StringTokenizer(str, " ");
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    if(A>B) {
        System.out.println(">");
    } else if(A<B) {
        System.out.println("<");
    } else {
        System.out.println("==");
    }


     

    
}
}