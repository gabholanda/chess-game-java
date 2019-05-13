/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author HOLANDAS
 */
// Classe que define a posição no tabuleiro
public class Position {
    private int row;
    private int column;
    public Position (int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public void setValues(int row, int column){
     this.row = row;
     this.column = column;
    }
    // retorna a posição no tabuleiro
    @Override
    public String toString(){
        return row +","+column;
    }
}
