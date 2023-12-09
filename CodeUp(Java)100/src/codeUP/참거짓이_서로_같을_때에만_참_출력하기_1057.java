package codeUP;

import java.util.Scanner;

public class 참거짓이_서로_같을_때에만_참_출력하기_1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");

        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        if (i1 == i2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
