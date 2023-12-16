package 백준.단계11_알고리즘_수행_시간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 백준_알고리즘_수행_시간6_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long i = Long.parseLong(br.readLine());
        BigInteger I = new BigInteger(String.valueOf(i - 2));
        BigInteger i_3 = I.multiply(I).multiply(I);
        BigInteger i_2 = I.multiply(I);

        BigInteger ans = i_3.add(i_2.multiply(new BigInteger(String.valueOf(3)))).add(I.multiply(new BigInteger(String.valueOf(2))));
        ans = ans.divide(new BigInteger(String.valueOf(6)));

        System.out.println(ans);
        System.out.println("3");
    }
}
