package edu.pg.sup;

public class ZwyklaKlasa {
    private static int liczbaInstancji = 0;
    private int numerInstancji;

    private class KlasaWewnetrzna implements SluchaczZdarzen {
        private int poleKlasyWewnetrznej;

        public KlasaWewnetrzna(int poleKlasyWewnetrznej) {
            this.poleKlasyWewnetrznej = poleKlasyWewnetrznej;

        }

        @Override
        public void wystapiloZdarzenie(int priorytet, String nazwa) {
            System.out.println("KlasaWewnętrzna(" + poleKlasyWewnetrznej + ") obsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);
        }
    }

    private static class StatycznaKlasaWewnetrzna implements SluchaczZdarzen {
        private int poleStatycznejKlasyWewnetrznej;

        public StatycznaKlasaWewnetrzna(int poleStatycznejKlasyWewnetrznej) {
            this.poleStatycznejKlasyWewnetrznej = poleStatycznejKlasyWewnetrznej;
        }

        @Override
        public void wystapiloZdarzenie(int priorytet, String nazwa) {
            System.out.println("StatycznaKlasaWewnetrzna(" + poleStatycznejKlasyWewnetrznej + ") obsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);
        }
    }

    public ZwyklaKlasa() {
        liczbaInstancji++;
        numerInstancji = liczbaInstancji;
    }

    public SluchaczZdarzen klasaWewnetrzna() {
        return new KlasaWewnetrzna(2 * numerInstancji);
    }

    public SluchaczZdarzen statycznaKlasaWewnetrzna() {
        return new StatycznaKlasaWewnetrzna(3 * liczbaInstancji);
    }

    public SluchaczZdarzen klasaAnonimowa() {
        return new SluchaczZdarzen() {
            int poleKlasyAnonimowej = 5 * numerInstancji;

            @Override
            public void wystapiloZdarzenie(int priorytet, String nazwa) {
                System.out.println("klasaAnonimowa(" + poleKlasyAnonimowej + ") obsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);

            }
        };
    }

    public SluchaczZdarzen wyrazenieLambda() {
        return (int priorytet, String nazwa) -> {
            System.out.println("wyrazenieLambda obsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);

        };
    }

    public void zwyklaMetoda(int priorytet, String nazwa) {
        System.out.println("zwyklaMetoda obsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);
    }


    public static void zwyklaMetodaStatyczna(int priorytet, String nazwa) {
        System.out.println("zwyklaMetodaStatycznaobsługuje zdarzenie " + nazwa + " o priortecie " + priorytet);
    }


}
