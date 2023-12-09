package codeUP;

import java.util.Arrays;
import java.util.Scanner;

public class 설탕과자_뽑기_1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mapSize = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] map = new int[mapSize[0]][mapSize[1]];
        int repeat = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()[0];

        for (int i = 0; i < repeat; i++) {
            int[] stick = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            stick[2] = stick[2] - 1;
            stick[3] = stick[3] - 1;

            if (stick[1] == 0) { // 0이면 막대가 가로
                for (int j = stick[3]; j < stick[3] + stick[0]; j++) {
                    map[stick[2]][j] = 1;
                }
            } else { // 막대가 세로
                for (int j = stick[2]; j < stick[2] + stick[0]; j++) {
                    map[j][stick[3]] = 1;
                }
            }
        }

        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}

