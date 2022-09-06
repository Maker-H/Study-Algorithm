package sec01_IO_Operations;


import java.util.*;
public class operation04_divide_1008 {
    public static void main(String[] args) {
        double A,B;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextDouble(); B = scanner.nextDouble();
        System.out.println(A/B);
        scanner.close();
    }
}
