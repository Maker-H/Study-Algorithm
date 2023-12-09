package codeUP;

import java.math.BigInteger;
import java.util.Scanner;

public class 정수_1개_입력받아_그대로_출력하기3_1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(num);
        System.out.println(bigInteger);
    }
}

