import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] bags = IntStream.rangeClosed(0, N).toArray();

        for (int k = 0; k < M; k++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);

            int[] tmp = new int[j - i + 1];
            tmp = IntStream.rangeClosed(i, j).map(z -> bags[j - z + i]).toArray();

            int countTmp = 0;
            for (int z = i; z <= j; z++) {
                bags[z] = tmp[countTmp];
                countTmp++;
            }
        }

        bw.write(String.join(" ",
                IntStream.rangeClosed(1, N)
                        .mapToObj(n -> String.valueOf(bags[n]))
                        .toArray(String[]::new)
        ));
        bw.flush();
    }

}

