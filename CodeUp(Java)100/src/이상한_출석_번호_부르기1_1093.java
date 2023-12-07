import java.util.Scanner;

public class 이상한_출석_번호_부르기1_1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[24];

        for (String s : input) {
            int convert = Integer.parseInt(s);
            arr[convert] += 1;
        }

        for (int i = 1; i <= 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

