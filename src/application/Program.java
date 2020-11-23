package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(inp);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(inp);
		
		chessMatch.performChessMove(source, target);
		
		}

	}

}
