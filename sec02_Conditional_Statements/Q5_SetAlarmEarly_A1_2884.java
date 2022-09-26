// https://www.acmicpc.net/problem/2884

package sec02_Conditional_Statements;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Q5_SetAlarmEarly_A1_2884{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        //calculate time as minute unit and subtract 45 minute
        int newHour, newMinute;
        if(hour!=0){
            newMinute = ((hour*60+minute)-45)%60; 
            newHour = ((hour*60+minute)-45)/60;
        } else { //exception occurs only on 24hours
            newMinute = (60+(((hour*60+minute)-45)%60))%60;
            newHour = 23;
            if(minute>=45){
               newHour=0;
            }
        }
        System.out.println(newHour+" "+newMinute);
        

   }
}