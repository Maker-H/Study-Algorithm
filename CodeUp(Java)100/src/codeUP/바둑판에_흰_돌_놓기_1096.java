package codeUP;

import java.util.Arrays;
import java.util.Scanner;

public class 바둑판에_흰_돌_놓기_1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] map = new int[20][20];
        for (int i = 0; i < n; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[array[0]][array[1]] = 1;
        }

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

