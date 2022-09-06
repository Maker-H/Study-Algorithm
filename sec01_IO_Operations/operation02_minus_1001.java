package sec01_IO_Operations;


import java.util.*;
public class operation02_minus_1001 {
    public static void main(String[] args) {
        int A,B;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt(); B = scanner.nextInt();
        System.out.println(A-B);
        scanner.close();
    }
}
