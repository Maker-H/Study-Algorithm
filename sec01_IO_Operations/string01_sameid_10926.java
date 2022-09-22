package sec01_IO_Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class string01_sameid_10926 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ID = br.readLine();
       
       System.out.println(ID+"??!");
    }
}
