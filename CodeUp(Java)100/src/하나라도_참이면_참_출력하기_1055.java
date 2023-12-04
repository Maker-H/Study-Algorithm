import java.util.Scanner;

public class 하나라도_참이면_참_출력하기_1055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");

        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        if (i1 == 1 || i2 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
