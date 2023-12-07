import java.util.Scanner;

public class 주사위를_2개_던지면_1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.valueOf(s[0]);
        int m = Integer.valueOf(s[1]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
