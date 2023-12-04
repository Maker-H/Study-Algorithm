import java.util.Scanner;

public class 정수_1개_입력받아_카운트다운_출력하기2_1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt() - 1;

        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}

