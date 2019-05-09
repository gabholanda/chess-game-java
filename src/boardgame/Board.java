package boardgame;

/**
 *
 * @author HOLANDAS
 */
public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Erro ao criar tabuleiro: É necessário no mínimo 1 linha e coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //método que recebe uma linha e coluna e retorna ela no tabuleiro
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pieces[row][column];
    }

    //método que recebe uma posição e retorna ela no tabuleiro - movimentação
    public Piece piece(Position position) {
        if (!positionExists(position.getRow(), position.getColumn())) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    // recebe uma peça para colocar no tabuleiro e informa a posição ao piece
    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("Ja há uma peça na posição: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    //Overloading positionExists
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && columns >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position.getRow(), position.getColumn())) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return piece(position) != null;
    }
}
