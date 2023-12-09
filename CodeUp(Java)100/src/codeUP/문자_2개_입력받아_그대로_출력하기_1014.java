package codeUP;

import java.util.Scanner;

public class 문자_2개_입력받아_그대로_출력하기_1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char next1 = scanner.next().charAt(0);
        char next2 = scanner.next().charAt(0);

        System.out.printf("%s %s", next2, next1);
    }
}
