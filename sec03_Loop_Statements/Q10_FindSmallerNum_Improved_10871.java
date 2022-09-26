// https://www.acmicpc.net/problem/10871

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_FindSmallerNum_Improved_10871 {
    public static void main(String[] args) throws IOException {
        int num = read();
        int baseNum = read();
        System.out.println(num);
        System.out.println(baseNum);



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