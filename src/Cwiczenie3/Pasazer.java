package Cwiczenie3;
import java.time.LocalDate;
import java.time.Period;

public class Pasazer {

    private String imie;
    private String nazwisko;

    public Pasazer (String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
