// https://www.acmicpc.net/problem/18108

package sec01_IO_Operations;

import java.util.*;
import java.io.*;
public class Q09_MakeTaiYear_18108 {
    public static void main(String[] args) throws IOException{
    int diff = 2541-1998;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int taiYear = Integer.parseInt(str);
    
    int myYear = taiYear - diff;
    System.out.println(myYear);
    }
    
}
