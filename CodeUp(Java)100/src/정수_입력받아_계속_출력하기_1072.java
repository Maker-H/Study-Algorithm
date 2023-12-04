import java.util.Scanner;

public class 정수_입력받아_계속_출력하기_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        String st2 = scanner.nextLine();
        String[] split = st2.split(" ");

        for (String s : split) {
            System.out.print(s + " ");
        }
    }
}