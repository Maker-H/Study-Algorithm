// https://www.acmicpc.net/problem/10952

package sec03_Loop_Statements;

import java.io.BufferedReader;
import java.io.IOException;

public class Q11_AddUntilZero_Original_10952 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int a,b;
        while(true){
            a = readNum();
            b = readNum();
            if(a==0 && b==0) {
                break;
            }
            sb.append(a+b).append('\n');
        }
        System.out.print(sb);
        
    }

    public static int readNum() throws IOException {
        int input;
        int resultNum=0;
        while(true) {
            input = System.in.read();
            if(input == ' ' || input == '\n') {
                return resultNum;
            } else {
                resultNum = input-48;
            }
        }
    }
}
