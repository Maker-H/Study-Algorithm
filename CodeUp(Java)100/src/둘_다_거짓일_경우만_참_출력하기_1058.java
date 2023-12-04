import java.util.Scanner;

public class 둘_다_거짓일_경우만_참_출력하기_1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");

        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        if (i1 == 0 && i2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
