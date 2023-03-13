package sec04_1D_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_GetRemainder_3052 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int [10];

        for(int i=0; i<10; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input % 42;
        }

        int count=0;
        int [] diffRemainder = new int[10];
        diffRemainder[0] = arr[0];
        for(int i=1; i<10; i++) {
            diffRemainder[count]=i;
        }
        System.out.println(count);

    }
}
