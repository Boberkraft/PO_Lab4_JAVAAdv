package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.Czlowiek;
import edu.pg.biegpolesie.DziedzinaZadania;
import edu.pg.biegpolesie.RodzajTerenu;

public class Student extends Czlowiek {
    private final String kierunekStudiow;
    public Student(String imie, String nazwisko, Plec plec, String kierunekStudiow) {
        super(imie, nazwisko, plec);
        this.kierunekStudiow = kierunekStudiow;
    }

    @Override
    public void przedstawSie() {

    }

    @Override
    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        return Math.min(100, super.rozwiazywaczZadan(dziedzinaZadania) * 2);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        boolean rozwiazane = rozwiazZadanieWynik(dziedzinaZadania);
        if (rozwiazane) {
            wypowiedzSie("Ale jestem mądry!");
        } else {
            wypowiedzSie("Ale jestem GŁĄB!");
        }
        return rozwiazane;
    }
}
