package edu.pg.biegpolesie.ludzie;

import edu.pg.biegpolesie.Czlowiek;
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
        if (RodzajTerenu.BAGNO.equals(rodzajTerenu)) {
            wypowiedzSie("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.2; //Od 0.2 do 0.4
        } else
            return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
    }


}
