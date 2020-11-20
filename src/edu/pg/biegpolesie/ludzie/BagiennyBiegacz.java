package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.Czlowiek;
import edu.pg.biegpolesie.DziedzinaZadania;
import edu.pg.biegpolesie.RodzajTerenu;


public class BagiennyBiegacz extends Czlowiek {

    public BagiennyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Moją ulubioną rośliną jest mech bagienny.");
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        double predkosc = super.predkoscPoruszaniaSie(rodzajTerenu);
        if (rodzajTerenu == RodzajTerenu.BAGNO) {
            wypowiedzSie("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            predkosc += 0.2;
        } else {
            return predkosc * 1.1;
        }
        return Math.min(1.0, predkosc);
    }
}
