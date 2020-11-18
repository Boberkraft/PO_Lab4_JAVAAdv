package edu.pg.biegpolesie;

public class FabrykaElementowTrasy {
    public static ElementTrasy utworzElementTrasy(DziedzinaZadania dziedzinaZadania) {
        return new Zadanie(dziedzinaZadania);
    }

    public static ElementTrasy utworzElementTrasy(RodzajTerenu rodzajTerenu) {
        return new Teren(rodzajTerenu);
    }

    public static ElementTrasy utworzElementTrasy(String rodzaj) throws IllegalArgumentException {
        ElementTrasy element;
        try {
            element = utworzElementTrasy(DziedzinaZadania.valueOf(rodzaj));
        } catch (IllegalArgumentException e) {
            element = utworzElementTrasy(RodzajTerenu.valueOf(rodzaj));
        }
        return element;
    }
}
