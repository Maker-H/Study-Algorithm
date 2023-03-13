// https://www.acmicpc.net/problem/1008

package sec01_IO_Operations;


import java.util.*;
import java.io.*;
public class Q06_operation04_divide_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str," ");
        
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);
    }
}
