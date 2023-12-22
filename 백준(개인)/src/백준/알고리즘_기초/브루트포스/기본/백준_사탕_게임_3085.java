package 백준.알고리즘_기초.브루트포스.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준_사탕_게임_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split("");
        }

        int ans = findLongest(N, arr);
        String compare = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //오른쪽이랑 비교
                if (j + 1 < N) {
                    compare = arr[i][j + 1];
                    if (!arr[i][j].equals(compare)) {
                        arr[i][j + 1] = arr[i][j];
                        arr[i][j] = compare;
                        int max = findLongest(N, arr);
                        if (ans < max) {
                            ans = max;
                        }

                        compare = arr[i][j + 1];
                        arr[i][j + 1] = arr[i][j];
                        arr[i][j] = compare;
                    }
                }

                //아래랑 비교
                if (i + 1 < N) {
                    compare = arr[i + 1][j];
                    if (!arr[i][j].equals(compare)) {
                        arr[i + 1][j] = arr[i][j];
                        arr[i][j] = compare;
                        int max = findLongest(N, arr);
                        if (ans < max) {
                            ans = max;
                        }

                        compare = arr[i + 1][j];
                        arr[i + 1][j] = arr[i][j];
                        arr[i][j] = compare;
                    }
                }
            }
        }


        System.out.println(ans);
    }

    public static int findLongest(int N, String[][] arr) {
        int rowMax = 0;
        int colMax = 0;

        for (int i = 0; i < N; i++) {
            String tmp = "";
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                // === 가로 ===
                if (j == 0) {
                    tmp = arr[i][j];
                    continue;
                }
                if (tmp.equals(arr[i][j])) {
                    cnt++;
                } else {
                    if (cnt > rowMax) {
                        rowMax = cnt;
                    }
                    cnt = 0;
                }
                tmp = arr[i][j];
            }

            if (cnt > rowMax) {
                rowMax = cnt;
            }


            cnt = 0;
            for (int j = 0; j < N; j++) {
                // === 세로 ===
                if (j == 0) {
                    tmp = arr[j][i];
                    continue;
                }

                if (tmp.equals(arr[j][i])) {
                    cnt++;
                } else {
                    if (cnt > colMax) {
                        colMax = cnt;
                    }
                    cnt = 0;
                }
                tmp = arr[j][i];
            }

            if (cnt > colMax) {
                colMax = cnt;
            }
        }
        return Math.max(colMax, rowMax) + 1;
    }

}

