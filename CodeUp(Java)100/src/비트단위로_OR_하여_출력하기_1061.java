import java.util.Scanner;

public class 비트단위로_OR_하여_출력하기_1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] split = word.split(" ");

        Integer i1 = Integer.valueOf(split[0]);
        Integer i2 = Integer.valueOf(split[1]);

        System.out.println(i1 | i2);
    }
}
