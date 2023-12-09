import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.Adler32;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int M = Integer.parseInt(numbers[1]);


        List<Integer> bags = IntStream.generate(() -> 0)
                .limit(N)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        for (int z = 0; z < M; z++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]) - 1;
            int j = Integer.parseInt(input[1]) - 1;
            int k = Integer.parseInt(input[2]);
            for (int a = i; a <= j; a++) {
                bags.set(a, k);
            }
        }

        bw.write(String.join(" ", bags.stream().map(Object::toString).toArray(String[]::new)));
        bw.flush();
    }

}

