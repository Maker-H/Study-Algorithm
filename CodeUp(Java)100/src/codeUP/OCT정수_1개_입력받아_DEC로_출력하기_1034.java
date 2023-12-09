package codeUP;

import java.util.Scanner;

public class OCT정수_1개_입력받아_DEC로_출력하기_1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        int i1 = Integer.parseInt(i, 8);
        System.out.printf("%d", i1);
    }
}

