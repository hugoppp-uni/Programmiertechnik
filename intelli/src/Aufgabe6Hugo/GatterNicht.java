package Aufgabe6Hugo;

public class GatterNicht implements Gatter {
    private Gatter eingang;

    @Override
    public boolean getOutput() {
        return !eingang.getOutput();
    }

    @Override
    public String toString() {
        return "nicht fertig";
    }

    public GatterNicht(Gatter eingang){
        this.eingang = eingang;
    }
}
