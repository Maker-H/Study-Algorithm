package codeUP;

import java.util.Scanner;

public class 원하는_문자가_입력될_때까지_반복_출력하기_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] charArray = scanner.nextLine().split(" ");

        for (String c : charArray) {
            if (c.equals("q")) {
                System.out.println("q");
                break;
            }
            System.out.println(c);
        }

    }
}

