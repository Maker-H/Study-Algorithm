import java.util.Scanner;

public class zero_입력될_때_까지_무한_출력하기2_1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String[] split = st.split(" ");

        for (String s : split) {
            if (s.equals("0")) {
                break;
            }
            System.out.println(s);
        }
    }
}