package org.game.chess;

import java.util.List;

public interface ChessPiece {
    List<String> getPossibleMoves(String position);
}
