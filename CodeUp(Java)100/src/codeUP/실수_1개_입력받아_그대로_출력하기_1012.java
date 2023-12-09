package codeUP;

import java.util.Scanner;

public class 실수_1개_입력받아_그대로_출력하기_1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();

        System.out.printf("%.6f", v);
    }
}
