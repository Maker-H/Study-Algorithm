import java.util.Scanner;

public class 정수_3개_입력받아_짝홀_출력하기_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] split = word.split(" ");

        Integer a = Integer.valueOf(split[0]);
        Integer b = Integer.valueOf(split[1]);
        Integer c = Integer.valueOf(split[2]);

        if (a % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (c % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
