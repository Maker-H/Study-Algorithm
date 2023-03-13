package sec04_1D_Array;

import java.io.*;
import java.util.StringTokenizer;

public class ex {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int [10];

        for(int i=0; i<10; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input % 42;
        }

        for(int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }

        
}
}