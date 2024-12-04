package org.game.chess;

public class BoardImpl implements Board {
    private static final int BOARD_SIZE = 8;

    @Override
    public int[] notationToIndex(String position) {
        position = position.toUpperCase();
        char column = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));
        int colIndex = column - 'A';
        int rowIndex = BOARD_SIZE - row;
        return new int[]{rowIndex, colIndex};
    }

    @Override
    public String indexToNotation(int row, int col) {
        char column = (char) (col + 'A');
        int rowNum = BOARD_SIZE - row;
        return new StringBuilder().append(column).append(rowNum).toString();
    }

    @Override
    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE;
    }
}
