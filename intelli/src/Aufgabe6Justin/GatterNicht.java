package Aufgabe6Justin;

public class GatterNicht implements Gatter {
    public Gatter eingang;

    public GatterNicht(Gatter eingang) {
        this.eingang = eingang;
    }

    @Override
    public boolean getOutput() {
        return !eingang.getOutput();
    }

    @Override
    public String toString() {
        return "NICHT(" + eingang.getOutput() + ")";
    }
}
