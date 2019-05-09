
package chess;

import boardgame.Board;
import chess.pieces.*;

/**
 *
 * @author HOLANDAS
 */
public class ChessMatch {
    
    private Board board;
    
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    
    public ChessPiece [][] getPieces(){
        ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0;i<board.getRows();i++){
            for(int j = 0;j<board.getColumns();j++){
                mat[i][j] = (ChessPiece)board.piece(i,j);
            }
        }
        return mat;
    }
    //coloca uma peça nova no xadrez
    private void placeNewPiece(char column, int row,ChessPiece piece){
        //converte para sistema de Matriz toPosition()
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }
    //Inicia o jogo
    private void initialSetup(){
        placeNewPiece('b',6,new Rook(board,Color.WHITE));
        placeNewPiece('e',8,new King(board,Color.WHITE));
        placeNewPiece('e',1,new King(board,Color.WHITE));
    }
}
