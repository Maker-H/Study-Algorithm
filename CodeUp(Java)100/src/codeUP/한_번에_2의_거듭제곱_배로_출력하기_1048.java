package codeUP;

import java.util.Scanner;

public class 한_번에_2의_거듭제곱_배로_출력하기_1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        System.out.println(i1 << i2);

    }
}

