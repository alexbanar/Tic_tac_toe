package edu.alex.java;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[][] board = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        IO.printBoard(board);

        String turn = "X";//IO.getString("Pick turn: O or X");

        boolean isWin = false;
        do {
            {

                int[] pos = TicTacToe.getPositionInBoard(board);
                int row = pos[0];
                int column = pos[1];

                board[row][column] = turn;
                if (turn == "X") {
                    turn = "O";
                } else {
                    turn = "X";
                }
            }

            IO.printBoard(board);
            isWin = TicTacToe.checkWin(board);
            if(isWin)
            {
                IO.print((turn == "X" ? "O": "X") + " win!!!");
            }
            else
            {
                if(TicTacToe.checkBoardFull(board))
                {
                    IO.print("It is draw");
                    break;
                }
            }

        } while(!isWin);
    }




}
