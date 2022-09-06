package sec01_IO_Operations;

import java.util.*;
public class operation07_chessSet_3003 {
    public static void main(String[] args) {
    int userKing, userQueen, userRook, userBishop, userKnight, userPawn;
    int KING=1,QUEEN=1, ROOK=2, BISHOP=2, KNIGHT=2,PAWN=8;
    Scanner sc = new Scanner(System.in);

    userKing = sc.nextInt();
    userQueen = sc.nextInt();
    userRook = sc.nextInt();
    userBishop = sc.nextInt();
    userKnight = sc.nextInt();
    userPawn = sc.nextInt();

    System.out.println(KING-userKing);
    System.out.println(QUEEN-userQueen);
    System.out.println(ROOK-userRook);
    System.out.println(BISHOP-userBishop);
    System.out.println(KNIGHT-userKnight);
    System.out.println(PAWN-userPawn);
    }
}
