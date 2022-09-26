//https://www.acmicpc.net/problem/10950

/*
* I studied java by using 'System.out.prinln' to execute output. By using it what I have overlooked is to print, I have to always store variables.
* 
*Normal Operation could be done instatly na and printed by itself, not have to be stored 
*/
package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Q2_PrintAsManyAsIWant_Original_10950 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int put = Integer.parseInt(br.readLine());
        int a,b;
        int [] total =new int[put];
        int indexLength = put;
        
        while(put!=0){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            total[indexLength-put]=a+b;
            System.out.println("put "+put);
            put--;
        }
        
        while(put!=indexLength){
            System.out.println("put "+put);
            System.out.println(total[put]);
            put++;
        }
    }
}
