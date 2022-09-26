// https://www.acmicpc.net/problem/2438

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Q8_MakeStar_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<num;i++) {
            for(int j=0; j<=i;j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        

    }
}
