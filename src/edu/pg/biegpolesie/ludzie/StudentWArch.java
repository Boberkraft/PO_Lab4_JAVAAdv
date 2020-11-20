package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.DziedzinaZadania;

public class StudentWArch extends StudentPolitechniki {

    public StudentWArch(String imie, String nazwisko, Plec plec, String przedmiot) {
        super(imie, nazwisko, plec, przedmiot);
    }

    @Override
    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.SZTUKA) {
            return super.rozwiazywaczZadan(DziedzinaZadania.INFORMATYKA);
        }
        return super.rozwiazywaczZadan(dziedzinaZadania);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        boolean rozwiazane = rozwiazZadanieWynik(dziedzinaZadania);

        if (dziedzinaZadania == DziedzinaZadania.SZTUKA) {
            wypowiedzSie("Sztuka jest prosta.");
            return rozwiazane;
        }
        return super.rozwiazZadanie(dziedzinaZadania);
    }

}
