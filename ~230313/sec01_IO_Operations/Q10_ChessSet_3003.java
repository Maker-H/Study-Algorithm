// https://www.acmicpc.net/problem/3003

package sec01_IO_Operations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q10_ChessSet_3003 {
    public static void main(String[] args) throws IOException {

    int KING=1,QUEEN=1, ROOK=2, BISHOP=2, KNIGHT=2,PAWN=8;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    StringTokenizer st = new StringTokenizer(str, " ");
    int userKing = Integer.parseInt(st.nextToken());
    int userQueen = Integer.parseInt(st.nextToken());
    int userRook = Integer.parseInt(st.nextToken());
    int userBishop = Integer.parseInt(st.nextToken());
    int userKnight = Integer.parseInt(st.nextToken());
    int userPawn = Integer.parseInt(st.nextToken());

    System.out.println(KING-userKing);
    System.out.println(QUEEN-userQueen);
    System.out.println(ROOK-userRook);
    System.out.println(BISHOP-userBishop);
    System.out.println(KNIGHT-userKnight);
    System.out.println(PAWN-userPawn);
    }
}
