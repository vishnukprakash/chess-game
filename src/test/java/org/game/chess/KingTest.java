package org.game.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {
    @Test
    void testGetPossibleMoves() {
        King king = new King(new BoardImpl());
        List<String> possibleMoves = king.getPossibleMoves("D5");
        List<String> expectedMoves = new ArrayList<>(List.of("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6"));
        possibleMoves.sort(null);
        expectedMoves.sort(null);
        assertEquals(expectedMoves, possibleMoves);
    }
}