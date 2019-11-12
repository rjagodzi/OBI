package Cwiczenie3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lot {

    private LocalDateTime odlot;
    private LocalDateTime przylot;
    private Trasa trasa;
    private List<Bilet> bilet;
    private List<Pasazer> kolejkaOczekujacych;
    private Locale PL = new Locale("pl", "PL");
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE d-MM-yyyy HH:mm", PL);

    public Lot(LocalDateTime odlot, LocalDateTime przylot, Trasa trasa, List<Bilet> bilet, List<Pasazer> kolejkaOczekujacych) {
        this.odlot = odlot;
        this.przylot = przylot;
        this.trasa = trasa;
        this.bilet = bilet;
        this.kolejkaOczekujacych = kolejkaOczekujacych;
    }

    public LocalDateTime getOdlot() {
        return odlot;
    }

    public LocalDateTime getPrzylot() {
        return przylot;
    }

    public Trasa getTrasa() {
        return trasa;
    }

    public List<Bilet> getBilet() {
        return bilet;
    }

    public List<Pasazer> getKolejkaOczekujacych() {
        return kolejkaOczekujacych;
    }

    public void setOdlot(LocalDateTime odlot) {
        this.odlot = odlot;
    }

    public void setPrzylot(LocalDateTime przylot) {
        this.przylot = przylot;
    }

    public void setTrasa(Trasa trasa) {
        this.trasa = trasa;
    }

    @Override
    public String toString() {
        return trasa + " (odlot: " + dtf.format(odlot) +
                ", przylot: " + dtf.format(przylot) + ")";
    }
}
