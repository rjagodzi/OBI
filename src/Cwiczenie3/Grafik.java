package Cwiczenie3;

public class Grafik {

    private Lotnisko miejsceOdlotu;
    private Lotnisko miejscePrzylotu;

    public Grafik (Lotnisko miejsceOdlotu, Lotnisko miejscePrzylotu){
        this.miejsceOdlotu = miejsceOdlotu;
        this.miejscePrzylotu = miejscePrzylotu;
    }

    public Lotnisko getMiejsceOdlotu() {
        return miejsceOdlotu;
    }

    public Lotnisko getMiejscePrzylotu() {
        return miejscePrzylotu;
    }

    @Override
    public String toString() {
        return  miejsceOdlotu + "->" + miejscePrzylotu;
    }
}
