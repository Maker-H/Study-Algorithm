import java.util.Scanner;

public class game369_의_왕이_되자_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

