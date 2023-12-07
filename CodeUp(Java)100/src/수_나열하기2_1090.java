import java.util.Scanner;

public class 수_나열하기2_1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]) - 1;

        long ans = a;
        while (n > 0) {
            ans *= r;
            n--;
        }

        System.out.println(ans);

    }
}

