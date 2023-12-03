import java.util.Scanner;

public class HEX정수_1개_입력받아_OCT로_출력하기_1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        int i1 = Integer.parseInt(i, 16);
        System.out.printf("%o", i1);
    }
}

