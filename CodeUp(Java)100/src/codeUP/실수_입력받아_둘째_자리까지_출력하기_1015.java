package codeUP;

import java.util.Scanner;

public class 실수_입력받아_둘째_자리까지_출력하기_1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();

        System.out.printf("%.2f", v);
    }
}
