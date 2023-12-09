package codeUP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 년월일_입력받아_형식_바꿔_출력하기_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] splitDate = date.split("\\.");
        System.out.printf("%s-%s-%s", splitDate[2], splitDate[1], splitDate[0]);
    }
}
