package sec02_Conditional_Statements;

/* I slove this question by converting total input minute to hour&minute first. Then calculate hour-to-hour minute-to-minute adding. 

But what I overlooked was I really didn't had to do converting first. No matter what I've done in operation, converting must have to be done at the end. 

This means calculation was duplicated and executed twice. If I done converting job lastly, I would only need to add minute. Not adding hour-to-hour minute-to-minute. Only minute-to-minute*/

import java.io.*;
import java.util.*;

public class ConvertMinuteToHourMinute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int curHour = Integer.parseInt(st.nextToken());
        int curMinute = Integer.parseInt(st.nextToken());
        int cooktime =Integer.parseInt(br.readLine()); //get only by minute

        StringBuilder sb = new StringBuilder();
        
        
        /* start operate */

        int cookHour = cooktime/60;
        int cookMinute = cooktime%60;

        if((curMinute + cookMinute) >= 60) {
            curHour++;


            if(curHour+cookHour>=24){ //consequently, after calculated result will be 24 cause total min is over 60
                sb.append((curHour+cookHour)%24).append(" ");
            } else {
                sb.append(curHour + cookHour).append(" ");
            }

            sb.append(curMinute+cookMinute-60);
            //end of if(curMin+cookMin)>=60)
        } else {
            if(curHour+cookHour>=24){
                sb.append((curHour+cookHour)%24).append(" ");
            } else{
            sb.append(curHour+cookHour).append(" ");
            }
       
            sb.append(curMinute+cookMinute);
        }
        
        System.out.print(sb);
    }
}


/* 
 * String hourmin = in.readLine();
			int H = Integer.parseInt(hourmin.split(" ")[0]);
			int M = Integer.parseInt(hourmin.split(" ")[1]);
			int inputM = Integer.parseInt(in.readLine());
			
			int newMin = M + inputM;
			
			if(newMin >= 60)
			{
				H += newMin / 60;
				M = newMin % 60;
				if(H >= 24) {
					H %= 24;
				}
			}
			else
				M = newMin;

			StringBuilder sb = new StringBuilder();
			sb.append(H).append(" ").append(M);
			System.out.println(sb.toString());
 */