// https://www.acmicpc.net/problem/10871

/*
 * I didn't know the existence of System.in.read(); phrase. This code gets one char and return the ASCII of it. If I enter number 0, this code gets number as char. So the code gets number as ASCII of char '0'. Char '0' stands for number 48 and all other number's ASCII is the value that adding 48 to existing number.
 * 
 * In this case, 0~9 could be stored as int type value by -48. But for 10, System.in.read(); code get input 1 and 0 sepreately. This is the tricky part. I have to get input of char '1', conver it to number 1, make 1 as the tenths place and add up to number 0 which is in the ones place.
 */
package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10_FindSmallerNum_Original_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(st.nextToken());
        int baseNum = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);
        
        for(int i=0;i<num;i++) {
            int j = Integer.parseInt(st.nextToken());
            if(j<=baseNum) {
                sb.append(j).append(" ");
            }
        }
        System.out.println(sb);

        
    }
}
