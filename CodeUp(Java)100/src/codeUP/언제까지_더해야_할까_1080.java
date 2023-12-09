package codeUP;

import java.util.Scanner;

public class 언제까지_더해야_할까_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int total = 0;
        int start = 1;
        while (total < input) {
            total += start;
            start++;
        }

        System.out.println(start - 1);
    }
}

