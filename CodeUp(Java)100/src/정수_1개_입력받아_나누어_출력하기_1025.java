import java.util.Scanner;

public class 정수_1개_입력받아_나누어_출력하기_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] charArray = num.toCharArray();

        for (int i = 4; i >= 0; i--) {
            String ans = charArray[4 - i] + "0".repeat(i);
            System.out.printf("[%s]\n", ans);
        }

    }
}

