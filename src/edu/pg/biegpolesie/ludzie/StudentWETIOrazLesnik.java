package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.DziedzinaZadania;

public class StudentWETIOrazLesnik extends StudentWETI {
    public StudentWETIOrazLesnik(String imie, String nazwisko, Plec plec, String przedmiot) {
        super(imie, nazwisko, plec, przedmiot);
    }

    @Override
    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.NAUKI_LESNE) {
            return super.rozwiazywaczZadan(dziedzinaZadania) * 1.2;
        }
        return super.rozwiazywaczZadan(dziedzinaZadania);
    }
}
