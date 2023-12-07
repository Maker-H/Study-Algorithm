import java.util.Scanner;
import java.util.StringTokenizer;

public class 그림_파일_저장용량_계산하기_1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        long w = Long.parseLong(input[0]);
        long h = Long.parseLong(input[1]);
        long b = Long.parseLong(input[2]);

        long mul = w * h * b;
        double div = (1 << 20) * 8;

        System.out.printf("%.2f MB", mul / div);

    }
}
