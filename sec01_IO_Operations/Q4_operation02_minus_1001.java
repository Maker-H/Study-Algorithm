// https://www.acmicpc.net/problem/1001

package sec01_IO_Operations;


import java.util.*;
import java.io.*;
public class Q4_operation02_minus_1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.println(A-B);
     
    }
}
