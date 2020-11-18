package edu.pg;

import edu.pg.biegpolesie.*;
import edu.pg.biegpolesie.ludzie.BagiennyBiegacz;
import edu.pg.biegpolesie.roboty.RobotMobilny;
import edu.pg.sup.Javalab2_sup;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new BagiennyBiegacz("Krzysztof", "Kowalski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new RobotMobilny(1));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w aplikacji Bieg po Lesie. Wybierz bieg: ");
        System.out.println("1. Górki");
        System.out.println("2. Na przełaj z Matematyką");
        System.out.println("3. Bagienny miks naukowy");
        System.out.println("4. Własną trasę");
        int wybor = scanner.nextInt();

        BiegPoLesie bieg;

        switch (wybor) {
            default:
                System.out.println("Niezany wybór. Wybieranie opcji nr 1.");
            case 1:
                bieg = gorki(System.out, System.out);
                break;
            case 2:
                bieg = naPrzelajZMatematyka(System.out, System.out);
                break;
            case 3:
                bieg = bagiennyMiks(System.out, System.out);
                break;
            case 4:
                bieg = wlasnaTrasa(System.out, System.out);
                break;
        }

        for (Uczestnik u : uczestnicy) {
            bieg.dodajUczestnika(u);
        }

        bieg.przeprowadzImpreze();
    }

    private static BiegPoLesie gorki(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie gorki_ = new BiegPoLesie("Górki", mikrofon, przestrzenWLesie);

        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy("DROGA"));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));

        return gorki_;
    }

    private static BiegPoLesie naPrzelajZMatematyka(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie naPrzelaj = new BiegPoLesie("Na przełaj z matematyką", mikrofon, przestrzenWLesie);

        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));

        return naPrzelaj;
    }

    private static BiegPoLesie bagiennyMiks(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie miks = new BiegPoLesie("Bagienny miks naukowy", mikrofon, przestrzenWLesie);

        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.INFORMATYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.SZTUKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));

        return miks;
    }

    private static BiegPoLesie wlasnaTrasa(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie trasa = new BiegPoLesie("Własna trasa", mikrofon, przestrzenWLesie);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kreatorze biegów.");

        while (true) {
            System.out.println("Co budujesz?");
            String wybor = scanner.nextLine().toUpperCase();
            if (wybor.equals("NIC")) {
                break;
            }
            try {
                trasa.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(wybor));
                System.out.println("Dodane.");
            } catch(IllegalArgumentException e) {
                System.out.println("Nie wiem co to.");
            }
        }

        return trasa;
    }

}
