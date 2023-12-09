package codeUP;

import java.util.Scanner;

public class 정수_3개_입력받아_합과_평균_출력하기_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();

        long sum = num1 + num2 + num3;

        System.out.println(sum);
        System.out.printf("%.1f", (double) sum / 3);
    }
}

