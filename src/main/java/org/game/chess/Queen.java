package org.game.chess;

import java.util.ArrayList;
import java.util.List;

public class Queen implements ChessPiece {
    private static final int[][] DIRECTIONS = {
            {0, -1}, {0, 1}, {-1, 0}, {1, 0},
            {1, -1}, {-1, 1}, {-1, -1}, {1, 1}
    };

    private Board board;
    public Queen(Board board) {
        this.board = board;
    }

    @Override
    public List<String> getPossibleMoves(String position) {
        int[] index = board.notationToIndex(position);
        int row = index[0];
        int col = index[1];

        List<String> possibleMoves = new ArrayList<>();

        for (int[] direction : DIRECTIONS) {
            int steps = 1;
            while (true) {
                int newRow = row + direction[0] * steps;
                int newCol = col + direction[1] * steps;
                if (board.isValidPosition(newRow, newCol)) {
                    possibleMoves.add(board.indexToNotation(newRow, newCol));
                    steps++;
                } else {
                    break;
                }
            }
        }
        return possibleMoves;
    }
}
