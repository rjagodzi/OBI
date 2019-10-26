package Cwiczenie3;

import java.time.*;

public class Bilet {

    private double cena;
    private Lot lot;

    public Bilet(double cena, Lot lot){
        this.cena = cena;
        this.lot = lot;
    }

    public double getCena() {
        return cena;
    }

    public Lot getLot() {
        return lot;
    }
}
