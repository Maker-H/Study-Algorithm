package sec01_IO_Operations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class operation09_getblank_multiply_2588 {
    public static void main(String[] args) throws IOException{
        int num1, num2, total=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();


        num1=Integer.parseInt(str1);
        num2=Integer.parseInt(str2);

        int hunderd=num2/100;
        int ten=(num2/10)%10;
        int one=num2%10;
        
        System.out.println(one*num1);
        System.out.println(ten*num1);
        System.out.println(hunderd*num1);
        System.out.println(one*num1 + (ten*num1*10) + (hunderd*num1*100));

    }
    
}
