package codeUP;

import java.util.Scanner;

public class zero_입력될_때_까지_무한_출력하기_1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String[] split = st.split(" ");

        for (String s : split) {
            if (s.equals("0")) {
                break;
            }
            System.out.print(s + " ");
        }
    }
}