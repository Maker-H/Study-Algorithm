package sec01_IO_Operations;

import java.util.*;
public class operation09_getblank_multiply_2588 {
    public static void main(String[] args) {
        int num1, num2, total=0;
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();

        int hunderd=num2/100;
        int ten=(num2/10)%10;
        int one=num2%10;
        
        System.out.println(one*num1);
        System.out.println(ten*num1);
        System.out.println(hunderd*num1);
        System.out.println(one*num1 + (ten*num1*10) + (hunderd*num1*100));

    }
    
}
