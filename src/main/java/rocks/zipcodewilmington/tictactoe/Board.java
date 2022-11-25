package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }
    public Boolean column(char c) {
        for (int j = 0; j < 3; j++){
            if (board[0][j].equals(c) && board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j])){
                return true;
            }
        }
        return false;
    }

    public Boolean row (char c) {
        for(int i = 0; i <3; i++) {
            if (board[i][0].equals(c) && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])){
                return true;
            }
        }
        return false;
    }

    public Boolean diagonal(char c) {
        if (board[0] [0].equals (c) && board[0][0].equals (board [1] [1]) && board[0] [0].equals (board [2] [2])) {
            return true;
        }
        return board[0] [2].equals(c) && board[0][2].equals (board [1] [1]) && board [0] [2].equals(board[2][0]);
    }
    public Boolean isInFavorOfX() {
        char c = 'X';

        return row(c) || column(c) || diagonal(c);
    }

    public Boolean isInFavorOfO() {
       char c = 'O';

       return row(c) || column(c) || diagonal(c);
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        }
        return "";
    }

}
