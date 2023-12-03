import java.util.Scanner;
import java.util.StringTokenizer;

public class 시분초_입력받아_분만_출력하기_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        String[] splitTime = time.split(":");

        System.out.println(Integer.parseInt(splitTime[1]));
    }
}
