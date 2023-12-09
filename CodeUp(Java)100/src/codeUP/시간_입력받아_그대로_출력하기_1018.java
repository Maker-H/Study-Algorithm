package codeUP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 시간_입력받아_그대로_출력하기_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(time, ":");
        int[] arr = new int[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(arr[0] + ":" + arr[1]);

    }
}
