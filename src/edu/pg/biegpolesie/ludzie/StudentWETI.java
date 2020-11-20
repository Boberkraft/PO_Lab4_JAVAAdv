package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.DziedzinaZadania;

public class StudentWETI extends StudentPolitechniki {
    public StudentWETI(String imie, String nazwisko, Plec plec, String przedmiot) {
        super(imie, nazwisko, plec, przedmiot);
    }

    @Override
    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.INFORMATYKA) {
            return 99;
        }
        return super.rozwiazywaczZadan(dziedzinaZadania);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        boolean rozwiazane = rozwiazZadanieWynik(dziedzinaZadania);

        if (dziedzinaZadania == DziedzinaZadania.INFORMATYKA) {
            wypowiedzSie("Informatyke mam w małym palcu.");
            return rozwiazane;
        }
        return super.rozwiazZadanie(dziedzinaZadania);
    }
}
