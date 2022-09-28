// https://www.acmicpc.net/problem/2884 

package sec02_Conditional_Statements;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Q05_SetAlarmEarly_A3_2884{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int newHour = hour;
        int newMinute = minute - 45;
        
        if(newMinute<0){
            newHour--;
            newMinute+=60;
            if(newHour<0){
                newHour+=24;
            }
        }
        
        System.out.println(newHour+" "+newMinute);
    }
        

        

   
}