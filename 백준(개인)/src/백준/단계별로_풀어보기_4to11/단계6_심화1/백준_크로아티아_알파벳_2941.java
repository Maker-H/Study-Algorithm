package 백준.단계별로_풀어보기_4to11.단계6_심화1;

import java.io.*;
import java.util.ArrayList;

public class 백준_크로아티아_알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        ArrayList<String> map = new ArrayList<>();

        int i = 0;
        while (i < input.length) {
            boolean is_in = false;
            boolean skip = false;
//            System.out.println("11111 " + i + " " + is_in);

            if (i < input.length -2) {
                if (input[i].equals("d") && input[i + 1].equals("z") && input[i + 2].equals("=")) {
                    map.add("dz=");
                    i += 3;
                    is_in = true;
                    skip = true;
                }
            }

            if (!skip && i < input.length -1 ){
                 if (input[i].equals("c")) {
                    if (input[i + 1].equals("=") || input[i + 1].equals("-")) {
                        map.add("c-");
                        i += 2;
                        is_in = true;
                    }
                } else if (input[i].equals("l") && input[i + 1].equals("j")) {
                    i += 2;
                    map.add("lj");
                    is_in = true;
                } else if (input[i].equals("n") && input[i + 1].equals("j")) {
                    i += 2;
                    map.add("nj");
                    is_in = true;
                } else if (input[i].equals("s") && input[i + 1].equals("=")) {
                    i += 2;
                    map.add("s=");
                    is_in = true;
                } else if (input[i].equals("z") && input[i + 1].equals("=")) {
                    i += 2;
                    map.add("z=");
                    is_in = true;
                } else if (input[i].equals("d") && input[i + 1].equals("-")) {
                    map.add("d-");
                    i += 2;
                    is_in = true;
                }
            }

//            System.out.println("222 " + i + " " + is_in);

            if (!is_in) {
//                System.out.println("들어오나");
                map.add(input[i]);
                i++;
            }

        }

//        bw.write(map.toString());
        bw.write(String.valueOf(map.size()));
        bw.flush();
    }

}

