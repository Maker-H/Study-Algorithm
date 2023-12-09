package codeUP;

import java.util.Scanner;

public class 수_나열하기1_1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]) - 1;

        int ans = a;
        while (n > 0) {
            ans += d;
            n--;
        }

        System.out.println(ans);

    }
}

