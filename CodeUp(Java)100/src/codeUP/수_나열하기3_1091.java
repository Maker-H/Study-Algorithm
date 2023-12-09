package codeUP;

import java.util.Scanner;

public class 수_나열하기3_1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int n = Integer.parseInt(input[3]) - 1;

        long ans = a;
        while (n > 0) {
            ans = ans * m + d;
            n--;
        }

        System.out.println(ans);

    }
}

