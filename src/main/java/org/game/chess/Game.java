package org.game.chess;

import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new BoardImpl();
        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.print("Enter piece and position (e.g., 'Pawn, G2'): ");
                String input = scanner.nextLine();

                // Split the input into piece and position
                String[] parts = input.split(",");
                String pieceName = parts[0].trim();
                String position = parts[1].trim();

                ChessPiece piece = null;

                switch (pieceName.toLowerCase()) {
                    case "pawn":
                        piece = new Pawn(board);
                        break;
                    case "king":
                        piece = new King(board);
                        break;
                    case "queen":
                        piece = new Queen(board);
                        break;
                    default:
                        System.out.println("Invalid piece type.");
                        return;
                }
                List<String> possibleMoves = piece.getPossibleMoves(position);
                System.out.println("Possible moves: " + String.join(" ", possibleMoves));
            }
        }
    }
}