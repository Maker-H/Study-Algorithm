//https://www.acmicpc.net/problem/2562

package sec04_1D_Array;

import java.io.IOException;

public class Q2_GetMax_A2_2562 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int count=0;

        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<9; i++) {
            int input = readInt();
            int earlierMax = max;
            max = Math.max(input, max);

            if(earlierMax != max) {
                count=i+1;
            }
        }
        sb.append(max).append('\n').append(count);
        System.out.println(sb);
    }

    public static int readInt() throws IOException {
        int value=0;
        while(true) {
            int input=System.in.read();
            if(input == '\n'){
                return value;
            } else{
                value = (value*10) + input -'0';
            }
        }
    }
}
