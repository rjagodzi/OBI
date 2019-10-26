package Cwiczenie3;

public class Trasa {

    private Lotnisko miejsceOdlotu;
    private Lotnisko miejscePrzylotu;

    public Trasa (Lotnisko miejsceOdlotu, Lotnisko miejscePrzylotu){
        this.miejsceOdlotu = miejsceOdlotu;
        this.miejscePrzylotu = miejscePrzylotu;
    }

    public Lotnisko getMiejsceOdlotu() {
        return miejsceOdlotu;
    }

    public Lotnisko getMiejscePrzylotu() {
        return miejscePrzylotu;
    }

}
