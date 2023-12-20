package 백준.알고리즘_기초.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 백준_네_수_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger i1 = new BigInteger(input[0] + input[1]);
        BigInteger i2 = new BigInteger(input[2] + input[3]);
        System.out.println(i1.add(i2));

    }

}

