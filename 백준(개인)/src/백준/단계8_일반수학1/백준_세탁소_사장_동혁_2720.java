package 백준.단계8_일반수학1;

import java.io.*;

public class 백준_세탁소_사장_동혁_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int QUARTER = 25;
        int DIME = 10;
        int NICKEL = 5;
        int PENNY = 1;

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            double input = Integer.parseInt(br.readLine());

            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            quarter = (int) Math.floor(input / QUARTER);
            input -= quarter * QUARTER;

            dime = (int) Math.floor(input / DIME);
            input -= dime * DIME;

            nickel = (int) Math.floor(input / NICKEL);
            input -= nickel * NICKEL;

            penny = (int) input;

            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
        }

    }
}
