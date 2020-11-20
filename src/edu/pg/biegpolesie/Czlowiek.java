package edu.pg.biegpolesie;

import java.io.PrintStream;
import java.util.Random;


public abstract class Czlowiek implements Uczestnik {

    public enum Plec {
        KOBIETA,
        MEZCZYZNA
    }

    private final String imie;
    private final String nazwisko;
    private final Plec plec;

    protected final Random humorIUwarunkowaniaOsobiste = new Random();

    private PrintStream osrodekKomunikacji = null;

    public Czlowiek(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }

    public abstract void przedstawSie();

    @Override
    public void mowDo(PrintStream ps) {
        osrodekKomunikacji = ps;
    }

    protected void wypowiedzSie(String tresc) {
        osrodekKomunikacji.print(imie + " " + nazwisko + " mówi: ");
        osrodekKomunikacji.println(tresc);
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch (rodzajTerenu) {
            case DROGA:
                wypowiedzSie("Idę sobie drogą.");
                return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.8; //Od 0.8 do 1.0
            case SCIEZKA:
                wypowiedzSie("Co za ładna ścieżka w lesie");
                return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.6; //Od 0.6 do 0.8
            case WYSOKI_LAS:
                wypowiedzSie("Idę na przełaj przez las. Może znajdę grzyby?");
                return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.4; //Od 0.4 do 0.6
            case NISKI_LAS:
                wypowiedzSie("Strasznie dużo gałęzi. Ciężko się idzie.");
                return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.2; //Od 0.2 do 0.4
            case BAGNO:
            default:
                wypowiedzSie("O rany! Gdzie ja jestem?");
                return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2; //Od 0 do 0.2
        }
    }

    protected double rozwiazywaczZadan(DziedzinaZadania dziedzinaZadania) {
        return 10;
    }

    final protected boolean rozwiazZadanieWynik(DziedzinaZadania dziedzinaZadania) {
        double prawdopodobienstwo = rozwiazywaczZadan(dziedzinaZadania);
        return Math.random()*100 <= prawdopodobienstwo;
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
