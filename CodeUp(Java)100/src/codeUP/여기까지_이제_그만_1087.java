package codeUP;

import java.util.Scanner;

public class 여기까지_이제_그만_1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int start = 1;
        int total = 0;
        while (total < input) {
            total += start;
            start++;
        }
        System.out.println(total);
    }
}