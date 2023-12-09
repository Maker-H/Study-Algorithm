package codeUP;

import java.util.Scanner;

public class 정수_3개_입력받아_가장_작은_수_출력하기_1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] split = word.split(" ");

        Integer a = Integer.valueOf(split[0]);
        Integer b = Integer.valueOf(split[1]);
        Integer c = Integer.valueOf(split[2]);

        System.out.println((a>b ? b : a)>c ? c : (a>b ? b : a));
    }
}
