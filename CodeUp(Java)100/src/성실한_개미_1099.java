import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 성실한_개미_1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] map = new int[10][10];
        int[] start = IntStream.generate(() -> 1).limit(2).toArray();

        for (int i = 0; i < 10; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            map[i] = array;
        }

        int x = start[1];
        int y = start[0];
        boolean flag = false;

        while (x < 10){
            if (map[y][x] == 2) {
                map[y][x] = 9;
                break;
            } else if (map[y][x] == 1) { // 도착한 곳이 벽이면 세로로 간다
                x--;
                while (y < 9){
                    y += 1;
                    if (map[y][x] == 2) {//세로도 뭔가 있으면 진짜 끝
                        map[y][x] = 9;
                        flag = true;
                        break;
                    } else if (map[y][x] == 1) {
                        flag = true;
                        break;
                    }
                    map[y][x] = 9;
//                    printMap(map);
                    if (map[y][x + 1] == 0) { // 다음 칸 오른쪽으로 갈 수 있으면 세로로는 그만 간다
                        break;
                    }
                }
                if (flag) break;
            }
            map[y][x] = 9;
            x += 1;
        }
            printMap(map);
    }




    public static void printMap(int[][] map) {
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


}

