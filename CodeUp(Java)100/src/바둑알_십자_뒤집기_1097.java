import java.util.Arrays;
import java.util.Scanner;

public class 바둑알_십자_뒤집기_1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            arr[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .map(s -> s - 1)
                    .toArray();

            for (int j = 0; j < 19; j++) {
                if (arr[j][array[1]] == 1) {
                    arr[j][array[1]] = 0;
                } else {
                    arr[j][array[1]] = 1;
                }
            }
            for (int j = 0; j < 19; j++) {
                if (arr[array[0]][j] == 1) {
                    arr[array[0]][j] = 0;
                } else {
                    arr[array[0]][j] = 1;
                }
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

