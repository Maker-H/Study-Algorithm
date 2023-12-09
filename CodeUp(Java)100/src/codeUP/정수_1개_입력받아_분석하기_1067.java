package codeUP;

import java.util.Scanner;

public class 정수_1개_입력받아_분석하기_1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i >= 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if (i % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
