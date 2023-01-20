package com.fitin.patterns.b.Memento;

public class StringAdding {
    private final StringAddingMemento memento = new StringAddingMemento(this);
    private String row = "";

    public String getRow() {
        return row;
    }

    public void resetRow(String row) {
        this.row = row;
    }

    public void deleteRow() {
        this.row = "";
    }

    public void addRow(String row) {
        this.row = this.row + row + "; ";
    }

    public void save(String key) {
        memento.save(key);
    }

    public void restore(String key) {
        memento.restore(key);
    }
}
