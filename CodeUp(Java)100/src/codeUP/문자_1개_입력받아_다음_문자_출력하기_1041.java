package codeUP;

import java.util.Scanner;

public class 문자_1개_입력받아_다음_문자_출력하기_1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int num = (int) c + 1;

        char ans = (char) num;

        System.out.println(ans);
    }
}
