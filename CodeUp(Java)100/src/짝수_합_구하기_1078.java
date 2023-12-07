import java.util.Scanner;

public class 짝수_합_구하기_1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int ans = 0;

        while (input > 0) {
            if (input % 2 == 0){
                ans += input;
            }

            input --;
        }

        System.out.println(ans);
    }
}
