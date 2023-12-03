import java.util.Scanner;

public class 단어_1개_입력받아_나누어_출력하기_1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            System.out.printf("\'%c\'\n", c);
        }
    }
}
