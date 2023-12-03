import java.util.Scanner;

public class 실수_1개_입력받아_그대로_출력하기2_1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        System.out.printf("%.11f", num);

    }
}
