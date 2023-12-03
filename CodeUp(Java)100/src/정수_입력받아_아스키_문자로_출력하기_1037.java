import java.util.Scanner;

public class 정수_입력받아_아스키_문자로_출력하기_1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char alpha = (char) num;
        System.out.printf("%c", alpha);
    }
}

