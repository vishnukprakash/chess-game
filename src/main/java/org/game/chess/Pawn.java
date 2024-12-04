package org.game.chess;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece{

    private Board board;
    public Pawn(Board board) {
        this.board = board;
    }

    @Override
    public List<String> getPossibleMoves(String position) {
        int[] index = board.notationToIndex(position);
        int row = index[0];
        int col = index[1];

        List<String> possibleMoves = new ArrayList<>();

        if (row > 0) {
            possibleMoves.add(board.indexToNotation(row - 1, col));
        }

        return possibleMoves;
    }
}
