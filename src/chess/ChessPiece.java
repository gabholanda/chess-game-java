
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }
    protected boolean isThereOpponentPiece(Position p){
        ChessPiece piece = (ChessPiece)getBoard().piece(p);
        return piece!=null && piece.getColor() != color;
    }
}
