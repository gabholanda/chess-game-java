
package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author HOLANDAS
 */
public abstract class ChessPiece extends Piece {
    private Color color;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
