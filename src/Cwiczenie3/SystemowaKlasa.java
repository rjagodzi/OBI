package Cwiczenie3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SystemowaKlasa {

    List<Pasazer> listaPasazerow;
    private List<Lot> listaLotow;
    private List<Grafik> listaGrafikow;
    private List<Samolot> listaSamolotow;
    private Map<String, Lotnisko> listaLotnisk;

    public SystemowaKlasa (List<Pasazer> listaPasazerow){
        this.listaPasazerow = listaPasazerow;
    }

    public List<Pasazer> getListaPasazerow() {
        return listaPasazerow;
    }



}
