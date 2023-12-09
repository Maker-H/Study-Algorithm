import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 과제_안내신_분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> students = IntStream.generate(()->0).limit(31).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine());
            students.set(student, 1);
        }

        int[] ans = IntStream.rangeClosed(1, students.size() - 1)
                .filter(i -> students.get(i) == 0)
                .toArray();

        Arrays.sort(ans);
        bw.write(String.valueOf(ans[0]) + "\n");
        bw.write(String.valueOf(ans[1]) + "\n");
        bw.flush();
    }

}

