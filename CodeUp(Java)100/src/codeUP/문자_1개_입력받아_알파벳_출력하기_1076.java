package codeUP;

import java.util.Scanner;

public class 문자_1개_입력받아_알파벳_출력하기_1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        for (int i = (int) 'a'; i <= (int) c; i++) {
            System.out.println((char) i);
        }
    }
}
