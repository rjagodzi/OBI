package Cwiczenie3;

public class Rezerwacja {

    public Pasazer pasazer;
    public Bilet bilet;

    public Rezerwacja (Pasazer pasazer, Bilet bilet){
        this.pasazer = pasazer;
        this.bilet = bilet;
    }

    public Pasazer getPasazer() {
        return pasazer;
    }

    public Bilet getBilet() {
        return bilet;
    }

    @Override
    public String toString() {
        return "Pasażer " + pasazer + bilet;
    }
}
