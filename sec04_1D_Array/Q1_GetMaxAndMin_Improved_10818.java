//https://www.acmicpc.net/problem/10818

/*I've learned what is Integer.MAX_VAlUE/Integer.MIN_VALUE and how to use method Math */

package sec04_1D_Array;

import java.io.IOException;

public class Q1_GetMaxAndMin_Improved_10818 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int times = readInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<times; i++){
            int num = readInt();

            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);

    }


    //method
    public static int readInt() throws IOException {
        boolean numSign = false;
        int value = 0; //number which I have to return consequently

        while(true) {
            int num = System.in.read();

            if(num == '-'){ //if number starts with minus
                numSign = true;
            } else if(num == ' ' || num == '\n') { //recognize the whole number 
                return numSign ? (-1 * value) : value;   
            } else {
                value = (value*10) +num - '0'; 
                //promote the number which was at ones place to tenths place and add ones place number and on and on and on 
            }
        }
    }
}