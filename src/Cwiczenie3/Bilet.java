package Cwiczenie3;

import java.time.*;

public class Bilet {

    private String pasazer;
    private double cena;
    private Lot lot;
    private String bagaz;

    public Bilet(String pasazer, double cena, Lot lot, String bagaz){
        this.pasazer = pasazer;
        this.cena = cena;
        this.lot = lot;
        this.bagaz = bagaz;
    }

    public double getCena() {
        return cena;
    }

    public Lot getLot() {
        return lot;
    }

    public String getPasazer() {
        return pasazer;
    }

    public String getBagaz() {
        return bagaz;
    }

    @Override
    public String toString() {
        return "kupił bilet w cenie " + cena + " zł" +
                " na lot " + lot;
    }
}
