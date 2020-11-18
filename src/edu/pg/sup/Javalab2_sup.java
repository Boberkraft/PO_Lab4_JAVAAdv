package edu.pg.sup;

import java.util.LinkedList;
import java.util.List;

public class Javalab2_sup {
    public static void main() {
        ZwyklaKlasa instancjaA = new ZwyklaKlasa();
        ZwyklaKlasa instancjaB = new ZwyklaKlasa();

        List<SluchaczZdarzen> listaSluchaczy = new LinkedList<>();

        listaSluchaczy.add(instancjaA.klasaWewnetrzna());
        listaSluchaczy.add(instancjaA.statycznaKlasaWewnetrzna());
        listaSluchaczy.add(instancjaA.klasaAnonimowa());
        listaSluchaczy.add(instancjaB.wyrazenieLambda());
        listaSluchaczy.add(instancjaB::zwyklaMetoda);
        listaSluchaczy.add(ZwyklaKlasa::zwyklaMetodaStatyczna);

        String nazwa = "test";
        int priorytet = 8;
        for(SluchaczZdarzen s : listaSluchaczy) {
            s.wystapiloZdarzenie(priorytet, nazwa);
        }
    }
}
