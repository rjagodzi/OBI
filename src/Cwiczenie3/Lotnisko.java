package Cwiczenie3;

import java.util.EnumMap;

public class Lotnisko {

    private Oznaczenie oznaczenie;

    public Lotnisko(Oznaczenie oznaczenie) {
        this.oznaczenie = oznaczenie;
    }

    public Oznaczenie getOznaczenie() {
        return oznaczenie;
    }

    enum Oznaczenie {
        ZRH("Zurych"),
        WRO("Wroclaw"),
        POZ("Poznan"),
        WAW("Warszawa");

        private final String nazwaMiejscowosci;

        Oznaczenie(String nazwaMiejscowosci) {
            this.nazwaMiejscowosci = nazwaMiejscowosci;
        }
    }
}
