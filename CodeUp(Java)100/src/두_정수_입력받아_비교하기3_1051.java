import java.util.Scanner;

public class 두_정수_입력받아_비교하기3_1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] split = num.split(" ");
        Integer a = Integer.valueOf(split[0]);
        Integer b = Integer.valueOf(split[1]);

        if (a <= b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
