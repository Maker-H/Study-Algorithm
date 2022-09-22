package sec02_Conditional_Statements;

import java.io.*;
import java.util.*;

public class ConvertMinuteToHourMinute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int curHour = Integer.parseInt(st.nextToken());
        int curMinute = Integer.parseInt(st.nextToken());
        int cooktime =Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int cookHour = cooktime/60;
        int cookMinute = cooktime%60;

        if((curMinute + cookMinute) >= 60) {
            curHour++;
            if(curHour+cookHour>=24){ //consequently, after calculated result will be 24 cause total min is over 60
                sb.append(curHour+cookHour-24).append(" ");
            } else {
                sb.append(curHour + cookHour).append(" ");
            }

            sb.append(curMinute+cookMinute-60);
        } else {
            sb.append(curHour+cookHour).append(" ");
            sb.append(curMinute+cookMinute);
        }
        
        System.out.print(sb);
    }
}
