package Cwiczenie3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lot {

        private LocalDateTime odlot;
        private LocalDateTime przylot;
        private int dostepneBilety;
        private Trasa trasa;
        private Locale PL = new Locale("pl", "PL");
        private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE d-MM-yyyy HH:mm", PL);

        public Lot(LocalDateTime odlot, LocalDateTime przylot, int dostepneBilety, Trasa trasa){
            this.odlot = odlot;
            this.przylot = przylot;
            this.dostepneBilety = dostepneBilety;
            this.trasa = trasa;
        }

    public LocalDateTime getOdlot() {
        return odlot;
    }

    public LocalDateTime getPrzylot() {
        return przylot;
    }

    public int getDostepneBilety() {
        return dostepneBilety;
    }

    public Trasa getTrasa() {
        return trasa;
    }

    public void setOdlot(LocalDateTime odlot) {
        this.odlot = odlot;
    }

    public void setPrzylot(LocalDateTime przylot) {
        this.przylot = przylot;
    }

    public void setDostepneBilety(int dostepneBilety) {
        this.dostepneBilety = dostepneBilety;
    }

    public void setTrasa(Trasa trasa) {
        this.trasa = trasa;
    }
}
