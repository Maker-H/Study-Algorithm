// https://www.acmicpc.net/problem/25304


package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Q4_CheckReciptAmout_25304 {
    public static void main(String[] args) throws IOException {
    int sum=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int totalamount = Integer.parseInt(str); //the amount of receipt
    str = br.readLine();
    int num = Integer.parseInt(str); //the number of stuff

    while(num!=0){
        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sum=a*b+sum;
        num--;
    }
    
    if(totalamount==sum){
        System.out.print("Yes");
    }else{
        System.out.print("No");
    }
}
}
