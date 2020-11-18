package edu.pg.biegpolesie;

import java.util.HashMap;
import java.util.Map;

public class Zadanie implements ElementTrasy {
    private final DziedzinaZadania dziedzinaZadania;
    private Map<Uczestnik, Double> uczestnicyNaZadaniu = new HashMap<>();

    public Zadanie(DziedzinaZadania dziedzinaZadania) {
        this.dziedzinaZadania = dziedzinaZadania;
    }

    public DziedzinaZadania getDziedzinaZadania() {
        return dziedzinaZadania;
    }

    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyNaZadaniu.keySet();
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyNaZadaniu.put(u, 0.0);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyNaZadaniu.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyNaZadaniu.size();
    }
}
