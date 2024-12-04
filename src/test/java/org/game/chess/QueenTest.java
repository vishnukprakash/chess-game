package org.game.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {
    @Test
    void testGetPossibleMoves() {
        Queen queen = new Queen(new BoardImpl());
        List<String> possibleMoves = queen.getPossibleMoves("E4");
        List<String> expectedMoves = new ArrayList<>(List.of("A4", "B4", "C4", "D4", "F4", "G4", "H4", "E1", "E2", "E3", "E5", "E6", "E7", "E8", "A8", "B7", "C6", "D5", "F3", "G2", "H1", "B1", "C2", "D3", "F5", "G6", "H7"));
        possibleMoves.sort(null);
        expectedMoves.sort(null);
        assertEquals(expectedMoves, possibleMoves);
    }
}