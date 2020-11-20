package edu.pg.biegpolesie;

import java.io.PrintStream;
import java.util.Random;


public abstract class Robot implements Uczestnik {

    private final String model;
    private final int numerSeryjny;
    protected final Random czynnikiLosowe = new Random();

    private PrintStream mediumKomunikacyjne;


    public Robot(String model, int numerSeryjny) {
        this.model = model;
        this.numerSeryjny = numerSeryjny;
    }


    @Override
    public void mowDo(PrintStream ps) {
        mediumKomunikacyjne = ps;
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        boolean rozwiazane = czynnikiLosowe.nextDouble() <= 0.1;
        if (rozwiazane) {
            komunikuj("ROZWIAZANE");
        } else {
            komunikuj("TO JAKIŚ SZYFR...");
        }
        return rozwiazane;
    }

    public final String identyfikuj() {
        return model + " nr " + numerSeryjny;
    }

    protected void komunikuj(String komunikat) {
        mediumKomunikacyjne.print(identyfikuj() + " komunikuje: ");
        mediumKomunikacyjne.println(komunikat);
    }

    @Override
    public String toString() {
        return identyfikuj();
    }
}
