import java.util.Scanner;

public class 정수_2개_입력받아_자동_계산하기_1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i1 = scanner.nextLong();
        long i2 = scanner.nextLong();

        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);
        System.out.println(i1 % i2);

        System.out.println(i1 + " " + i2);
        double ans = (double) i1 / i2;
        System.out.printf("%.2f", ans);

    }
}
