//https://www.acmicpc.net/problem/2562

package sec04_1D_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_GetMax_A1_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int max = 0;
        int num = 0;
        int index = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int value : arr) {
		  num++;
			if(value > max) {
				max = value;
				index = num;
			}
		}
        sb.append(max).append('\n').append(index);

        System.out.println(sb);

    }
}
