import java.util.Scanner;
import java.util.StringTokenizer;

public class 주민번호_입력받아_형태_바꿔_출력하기_1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] splitNum = num.split("-");
        System.out.println(splitNum[0] + splitNum[1]);
    }
}
