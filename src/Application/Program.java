
package Application;


import chess.ChessMatch;

/**
 *
 * @author Gabriel Holanda
 */
public class Program {

    
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
