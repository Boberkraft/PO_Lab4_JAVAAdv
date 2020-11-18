package edu.pg.biegpolesie;


public interface ElementTrasy {
    Iterable<Uczestnik> getUczestnicy();

    void dodajUczestnika(Uczestnik u);

    void usunUczestnika(Uczestnik u);

    int getLiczbaUczestnikowNaTrasie();
}
