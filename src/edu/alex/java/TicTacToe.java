package edu.alex.java;

/**
 * Created by Alex on 27-Jan-17.
 */
public class TicTacToe {

    static int[] getPositionInBoard(String[][] board) {
        int row;
        int column;

        do {
            row = IO.getInt("Choose row:", 1, 3) - 1;
            column = IO.getInt("Choose column:", 1, 3) - 1;
        }
        while (board[row][column].length() > 0);

        int[] arr = {row, column};
        return arr;
    }

    static boolean isRowWin(String board[][]) {
        boolean rowWin = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0].length() == 0) {
                continue;
            }
            String firstRowCell = board[i][0];
            for (int j = 1; j < board[i].length; j++) {
                if (!board[i][j].equals(firstRowCell)) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) {
                return true;
            }
            rowWin = true;
        }
        return false;
    }

    static boolean isColumnWin(String board[][])
    {
        boolean columnWin = true;
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j].length() == 0) {
                continue;
            }

            String firstColumnCell = board[0][j];
            for (int i = 1; i < board.length; i++) {
                if (!board[i][j].equals(firstColumnCell)) {
                    columnWin = false;
                    break;
                }
            }
            if (columnWin) {
                return true;
            }
            columnWin = true;
        }
        return false;

    }

    static boolean isLeftToRightDiagonalWin(String board[][])
    {
        if (board[0][0].length() == 0) {
            return false;
        }

        boolean diagonalLeftToRightWin = true;
        String firstLeftToRightDiagonalCell = board[0][0];
        for (int i = 1; i < board.length; i++) {
            if (!board[i][i].equals(firstLeftToRightDiagonalCell)) {
                diagonalLeftToRightWin = false;
                break;
            }
        }
        if (diagonalLeftToRightWin) {
            return true;
        }

        return false;

    }

    static boolean isRightToLeftDiagonalWin(String board[][])
    {
        if (board[0][board[0].length - 1].length() == 0) {
            return false;
        }

        boolean diagonalRightToLeftWin = true;
        String firstRightToLeftDiagonalCell = board[0][board[0].length - 1];
        for (int i = board[0].length - 2, j = 1; i < board.length; i++, j++) {
            if (!board[i][board[j].length - j - 1].equals(firstRightToLeftDiagonalCell)) {
                diagonalRightToLeftWin = false;
                break;
            }
        }
        if (diagonalRightToLeftWin) {
            return true;
        }

        return false;

    }

    static boolean checkWin(String board[][])
    {
        if(isRowWin(board) || isColumnWin(board)
            || isLeftToRightDiagonalWin(board) || isRightToLeftDiagonalWin(board))
        {
            return true;
        }
        return false;
    }

    static boolean checkBoardFull(String board[][])
    {
        for (int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if (board[i][j].length() == 0)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
