package org.game.chess;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PawnTest {
    @Test
    void testGetPossibleMoves() {
        Pawn pawn = new Pawn(new BoardImpl());
        List<String> possibleMoves = pawn.getPossibleMoves("E4");
        List<String> expectedMoves = List.of("E5");
        assertEquals(expectedMoves, possibleMoves);
    }
}