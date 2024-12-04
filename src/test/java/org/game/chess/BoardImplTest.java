package org.game.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardImplTest {

    @Test
    void shouldConvertNotationToIndex() {
        BoardImpl board = new BoardImpl();
        assertArrayEquals(new int[]{4, 4}, board.notationToIndex("E4"));
    }

    @Test
    void shouldConvertIndexToNotation() {
        BoardImpl board = new BoardImpl();
        assertEquals("E4", board.indexToNotation(4, 4));
    }

    @Test
    void isValidPositionShouldReturnFalseWhenPositionIsInvalid() {
        BoardImpl board = new BoardImpl();
        assertFalse(board.isValidPosition(8, 0));
    }

    @Test
    void isValidPositionShouldReturnTrueWhenPositionIsValid() {
        BoardImpl board = new BoardImpl();
        assertTrue(board.isValidPosition(4, 5));
    }
}