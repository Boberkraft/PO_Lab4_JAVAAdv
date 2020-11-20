package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.Czlowiek;
import edu.pg.biegpolesie.RodzajTerenu;

public class LesnyBiegacz extends Czlowiek {
    public LesnyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Lubię drzewa.");
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch(rodzajTerenu) {
            case BAGNO:
            case NISKI_LAS:
                return super.predkoscPoruszaniaSie(RodzajTerenu.DROGA);
            case WYSOKI_LAS:
                return super.predkoscPoruszaniaSie(RodzajTerenu.SCIEZKA);
            case SCIEZKA:
            case DROGA:
                return Math.min(1, super.predkoscPoruszaniaSie(rodzajTerenu) + 0.2);
            default:
                return super.predkoscPoruszaniaSie(rodzajTerenu);
        }

    }
}
