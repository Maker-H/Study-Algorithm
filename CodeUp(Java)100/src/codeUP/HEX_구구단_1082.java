package codeUP;

import java.util.Scanner;

public class HEX_구구단_1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int input = Integer.parseInt(s, 16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n",input, i, i * input);
        }
    }
}

