package codeUP;

import java.util.Arrays;
import java.util.Scanner;

public class 이상한_출석_번호_부르기3_1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(array);
        System.out.println(array[0]);
    }
}

