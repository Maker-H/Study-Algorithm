// https://www.acmicpc.net/problem/14681

package sec02_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_WhichQuadrant_14681 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x>0 && y>0) { //Quadrant 1
            System.out.println("1");
        } else if(x<0 && y>0) { //Quadrant 2
            System.out.println("2");
        } else if(x<0 && y<0) { //Quadrant 3
            System.out.println("3");
        } else { //Quadrant 4
            System.out.println("4");
        } 
    }
}
