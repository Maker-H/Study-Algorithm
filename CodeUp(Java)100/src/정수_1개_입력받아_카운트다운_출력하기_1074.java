import java.util.Scanner;

public class 정수_1개_입력받아_카운트다운_출력하기_1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}

