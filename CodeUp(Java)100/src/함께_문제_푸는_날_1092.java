import java.util.Scanner;

public class 함께_문제_푸는_날_1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int start = 1;
        while (start % a != 0 || start % b != 0 || start % c != 0) {
            start++;
        }
        System.out.println(start);
    }
}

