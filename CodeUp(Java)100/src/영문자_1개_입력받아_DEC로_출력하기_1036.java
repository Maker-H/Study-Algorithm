import java.util.Scanner;

public class 영문자_1개_입력받아_DEC로_출력하기_1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alpha = scanner.next().charAt(0);
        System.out.printf("%d", (int) alpha);
    }
}

