import java.util.Scanner;

public class 실수_1개_입력받아_부분별로_출력하기_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] splitNum = num.split("\\.");

        System.out.printf("%s\n%s", splitNum[0], splitNum[1]);
    }
}
