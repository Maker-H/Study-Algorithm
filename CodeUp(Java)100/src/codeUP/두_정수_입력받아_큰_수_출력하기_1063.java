package codeUP;

import java.util.Scanner;

public class 두_정수_입력받아_큰_수_출력하기_1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] split = word.split(" ");

        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        System.out.println(i1 > i2 ? i1 : i2);
    }
}
