package sec02_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CalculatePrizeMoneyByDice_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int [] dice  = new int [3] ;
        dice[0] = Integer.parseInt(st.nextToken());
        dice[1] = Integer.parseInt(st.nextToken());
        dice[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(dice);

        StringBuilder sb = new StringBuilder();
        if(dice[2]==dice[0]) { //all the same
            sb.append(10000+(dice[2]*1000));
        }else if(dice[1]<dice[2]){
            if(dice[1]==dice[0]){ 
                sb.append(1000+(dice[1]*100));
            } else sb.append(dice[2]*100);
        }else if(dice[0]<dice[1]){
            if(dice[1]==dice[2]){
                sb.append(1000+(dice[1]*100));
            }else sb.append(dice[2]*100);
        }
        /* 
        if(dice[0]==dice[1] && dice[1]==dice[2]) {
            System.out.println(10000+dice[0]*100);
        } else if(dice[0] == dice[1]) {
            System.out.println(1000+dice[0]*100);
        } else if(dice[1] ==dice[2]) {
            System.out.println(1000+dice[1]*100);
        } else if(dice[0]==dice[2]){
            System.out.println(1000+dice[0]*100);
        } else {
            System.out.print(Math.max(dice[2],(Math.max(dice[0], dice[1]))));
        }*/

        System.out.print(sb);
        
    }
}