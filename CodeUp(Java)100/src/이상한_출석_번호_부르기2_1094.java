import java.util.Scanner;

public class 이상한_출석_번호_부르기2_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }
    }
}

