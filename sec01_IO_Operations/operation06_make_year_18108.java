package sec01_IO_Operations;

import java.util.*;
public class operation06_make_year_18108 {
    public static void main(String[] args) {
    int taiYear;
    int myYear;
    int diff = 2541-1998;
    Scanner sc = new Scanner(System.in);

    taiYear = sc.nextInt();
    myYear = taiYear - diff;
    System.out.println(myYear);
    }
    
}
