// https://www.acmicpc.net/problem/10871
// https://halfmoonbearlog.tistory.com/57  <-About System.in.read
// https://halfmoonbearlog.tistory.com/58  <-About while and for loop
/*
 * I didn't know the existence of System.in.read(); phrase. This code gets one char and return the ASCII of it. If I enter number 0, this code gets number as char. So the code gets number as ASCII of char '0'. Char '0' stands for number 48 and all other number's ASCII is the value that adding 48 to existing number.
 * 
 * In this case, 0~9 could be stored as int type value by -48. But for 10, System.in.read(); code get input 1 and 0 sepreately. This is the tricky part. I have to get input of char '1', conver it to number 1, make 1 as the tenths place and add up to number 0 which is in the ones place.
 */

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_FindSmallerNum_Improved_10871 {
    public static void main(String[] args) throws IOException {
        int num = read();
        int baseNum = read();
        StringBuilder sb = new StringBuilder();

        while(num!=0){
            int inputNum=read();
            if(baseNum>inputNum){
                sb.append(inputNum).append(" ");
            }
            num--;
        }
        System.out.println(sb);


    }
     public static int read() throws IOException {
        int totalValue=0;
        int input;
        while(true){ 
            input = System.in.read();
            
            //if iostream meets space or \n, loop ends
            if(input=='\n' || input==' ') {       
                return totalValue;
            } else {
                totalValue = 
                (totalValue*10) 
                + (input-48);
            }
        }
     }
}