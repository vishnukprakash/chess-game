package org.game.chess;

import java.util.ArrayList;
import java.util.List;

public class King implements ChessPiece {
    private Board board;
    public King(Board board) {
        this.board = board;
    }

    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    @Override
    public List<String> getPossibleMoves(String position) {
        int[] index = board.notationToIndex(position);
        int row = index[0];
        int col = index[1];

        List<String> possibleMoves = new ArrayList<>();

        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (board.isValidPosition(newRow, newCol)) {
                possibleMoves.add(board.indexToNotation(newRow, newCol));
            }
        }

        return possibleMoves;
    }
}
