package Cwiczenie3;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pasazer {

    private String imie;
    private String nazwisko;
    private List<Bilet> bilet;

    public Pasazer (String imie, String nazwisko, List<Bilet> bilet){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.bilet = bilet;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Bilet> getBilet() {
        return bilet;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " ";
    }
}
