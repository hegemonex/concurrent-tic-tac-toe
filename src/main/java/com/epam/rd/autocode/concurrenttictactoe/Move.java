package com.epam.rd.autocode.concurrenttictactoe;

public class Move {
    final int row;
    final int column;

    public Move(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}