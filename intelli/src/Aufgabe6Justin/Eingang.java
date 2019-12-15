package Aufgabe6Justin;

public class Eingang implements Gatter {
    private boolean wert;

    public Eingang(boolean wert) {
        this.wert = wert;
    }

    @Override
    public boolean getOutput() {
        return wert;
    }

    @Override
    public String toString() {
        return wert ? " WAHR " : " FALSCH ";
    }
}
