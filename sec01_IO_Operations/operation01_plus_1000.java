package sec01_IO_Operations;

import java.util.*;
public class operation01_plus_1000 {
    public static void main(String[] args) {
        int A,B;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt(); B = scanner.nextInt();
        System.out.println(A+B);
        scanner.close();
    }
}
