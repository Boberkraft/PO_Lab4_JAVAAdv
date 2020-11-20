package edu.pg.biegpolesie.roboty;

import edu.pg.biegpolesie.DziedzinaZadania;
import edu.pg.biegpolesie.Robot;
import edu.pg.biegpolesie.RodzajTerenu;

public class Terminator extends Robot {
    public Terminator(int numerSeryjny) {
        super("T-101", numerSeryjny);
    }

    protected Terminator(String model, int numerSeryjny) {
        super(model, numerSeryjny);
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch (rodzajTerenu) {
            case DROGA:
                komunikuj("Wykryto teren: " + rodzajTerenu + '.');
                return czynnikiLosowe.nextDouble() * 0.2 + 0.9;
            case SCIEZKA:
                komunikuj("Wykryto teren: " + rodzajTerenu + '.');
                return czynnikiLosowe.nextDouble() * 0.2 + 0.8;
            case WYSOKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + '.');
                return czynnikiLosowe.nextDouble() * 0.2 + 0.5;
            case NISKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + '.');
                return czynnikiLosowe.nextDouble() * 0.3 + 0.3;
            case BAGNO:
            default:
                komunikuj("Wykryto teren: " + rodzajTerenu + '.');
                komunikuj("TRUDNO");
                return czynnikiLosowe.nextDouble() * 0.3;
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        switch (dziedzinaZadania) {
            case MATEMATYKA:
            case INFORMATYKA:
            case FIZYKA:
                komunikuj("DOMINACJA");
                return true;
            default:
                return super.rozwiazZadanie(dziedzinaZadania);
        }
    }
}
