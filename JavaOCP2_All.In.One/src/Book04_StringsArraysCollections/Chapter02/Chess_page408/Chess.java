package Book04_StringsArraysCollections.Chapter02.Chess_page408;

import java.util.Scanner;

import static Book04_StringsArraysCollections.Chapter02.Chess_page408.ShowKnightMoves.convertSquareToPos;

public class Chess {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Knight Move calculator.\n");
        do {
            showKnightMoves();
        }
        while (getYorN("Do it again?"));
    }

    private static boolean getYorN(String s) {
        return false;
    }

    public static void showKnightMoves() {
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8];
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        // get the knight's initial position
        do {
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);


        // this class represents x, y coordinates on the board
        class Pos {
            public int x;
            public int y;

            public Pos(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
    }
}
