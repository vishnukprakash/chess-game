package org.game.chess;

public interface Board {
    public int[] notationToIndex(String position);
    public String indexToNotation(int row, int col);
    public boolean isValidPosition(int row, int col);
}
