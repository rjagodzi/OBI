package Cwiczenie3;

import java.time.*;

public class Test {

    public static void main(String[] args) {

        Lotnisko WAW = new Lotnisko("Warszawa");
        Lotnisko LON = new Lotnisko("Londyn");
        Lotnisko ROM = new Lotnisko("Rzym");

        Trasa WAWLON = new Trasa(WAW, LON);
        Trasa WAWROM = new Trasa(WAW, ROM);
        Trasa LONROM = new Trasa(LON, ROM);

        Pasazer p1 = new Pasazer("John", "McClane");
        Pasazer p2 = new Pasazer("Arnold", "Schwarzenegger");
        Pasazer p3 = new Pasazer("Guybrush", "Threepwood");

        LocalDateTime odlot1 = LocalDateTime.of(LocalDate.of(1987, 01, 22), LocalTime.of(20,00));
        LocalDateTime odlot2 = LocalDateTime.of(LocalDate.of(1987, 10, 15), LocalTime.of(22,15));

        Lot lot1 = new Lot(odlot1, odlot1.plusHours(3), 5, WAWLON);
        Lot lot2 = new Lot(odlot2, odlot2.plusHours(2), 3, WAWROM);

        Bilet bilet1 = new Bilet(500, lot1);
        Bilet bilet2 = new Bilet(400, lot2);
    }
}
