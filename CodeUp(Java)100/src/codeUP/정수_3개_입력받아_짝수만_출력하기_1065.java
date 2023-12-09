package codeUP;

import java.util.Scanner;

public class 정수_3개_입력받아_짝수만_출력하기_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] split = word.split(" ");

        Integer a = Integer.valueOf(split[0]);
        Integer b = Integer.valueOf(split[1]);
        Integer c = Integer.valueOf(split[2]);

        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0){
            System.out.println(c);
        }
    }
}
