//https://www.acmicpc.net/problem/10818

/*I've learned what is Integer.MAX_VAlUE/Integer.MIN_VALUE and how to use method Math */

package sec04_1D_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Q1_GetMaxAndMin_Original_10818 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        
        arr[0] = Integer.parseInt(st.nextToken());
        int min=arr[0],max=arr[0];
        
        for(int i=1; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
