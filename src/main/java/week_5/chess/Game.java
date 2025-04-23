package week_5.chess;

public class Game {
    private Piece[][] board;

    Game() {
        this.board = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = new EmptyPiece();
            }
        }
    }

    void makeMove(int x1, int y1, int x2, int y2) {
        if (!board[x2][y2].name().equals(" ")) {

        }
        if (board[x1][y1].canMove(x2, y2)) {
        };
    }

    void printBoard() {
        System.out.print('\t');
        for (char c = 'A';  c <= 'H'; c++) {
            System.out.print(c + "" + '\t');
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "" + '\t');
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].name() + '\t');
            }
            System.out.println();
        }
    }
}
