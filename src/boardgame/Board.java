
package boardgame;

/**
 *
 * @author HOLANDAS
 */
public class Board {
    private  int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    //método que recebe uma linha e coluna e retorna ela no tabuleiro
    public Piece piece(int row,int column){
        return pieces[row][column];
    }
    //método que recebe uma posição e retorna ela no tabuleiro - movimentação
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
