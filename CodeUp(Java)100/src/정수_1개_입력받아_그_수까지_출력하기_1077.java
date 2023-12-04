import java.math.BigInteger;
import java.util.Scanner;

public class 정수_1개_입력받아_그_수까지_출력하기_1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int i = 0;

        while (i <= target){
            System.out.println(i);
            i++;
        }
    }
}
