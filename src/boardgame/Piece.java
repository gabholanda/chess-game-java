package boardgame;

/**
 *
 * @author HOLANDAS
 */
// Classe que define a peça
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }
    //Somente acessado por classes e subclasses de Piece
    protected Board getBoard() {
        return board;
    }
    
}
