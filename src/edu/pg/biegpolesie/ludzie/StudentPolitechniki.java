package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.DziedzinaZadania;

import java.util.Random;

public class StudentPolitechniki extends Student {
    public StudentPolitechniki(String imie, String nazwisko, Plec plec, String kierunekStudiow) {
        super(imie, nazwisko, plec, kierunekStudiow);
    }

    @Override
    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        switch (dziedzinaZadania) {
            case FIZYKA:
                return 50;
            case MATEMATYKA:
            case INFORMATYKA:
                return 70;
            default:
                return super.rozwiazywaczZadan(dziedzinaZadania);
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        boolean rozwiazane = rozwiazZadanieWynik(dziedzinaZadania);

        switch (dziedzinaZadania) {
            case FIZYKA:
                wypowiedzSie("Fizyka? Nie no łatwe...");
                break;
            case MATEMATYKA:
                wypowiedzSie("Matematyka jest prosta");
                break;
            case INFORMATYKA:
                wypowiedzSie("Informatyka jest prosta.");
                break;
            default:
                wypowiedzSie("Ojezu nie kumam");
        }
        return rozwiazane;
    }

}
