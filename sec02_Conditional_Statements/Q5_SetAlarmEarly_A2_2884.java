// https://www.acmicpc.net/problem/2884

/* Most Fast */


package sec02_Conditional_Statements;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Q5_SetAlarmEarly_A2_2884{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        bf.close();

        StringBuilder sb = new StringBuilder();



        if(minute<45){
            
            if(hour==0) {
                hour = 23;
                sb.append(hour).append(" ");
                
            } else {
                hour--;
                sb.append(hour).append(" ");
            }

            minute+=15;
            sb.append(minute);

        } else {
            minute-=45;
            sb.append(hour).append(" ").append(minute);
        }
        
        System.out.println(sb);
    }
        

        

   
}