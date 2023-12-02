import java.util.Scanner;
import java.util.StringTokenizer;

public class 년월일_입력받아_그대로_출력하기_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(date, ".");
        int[] arr = new int[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
    }
}
