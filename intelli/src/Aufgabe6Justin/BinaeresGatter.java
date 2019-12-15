package Aufgabe6Justin;

public class BinaeresGatter implements Gatter {
    protected Gatter[] eingaenge = new Gatter[2];

    public BinaeresGatter(Gatter eingang1, Gatter eingang2) {
        eingaenge[0] = eingang1;
        eingaenge[1] = eingang2;
    }

    @Override
    public boolean getOutput() {
        throw new IllegalArgumentException("getOutput() kann für BinaeresGatter nicht aufgerufen werden");
    }

    @Override
    public String toString() {
        throw new IllegalArgumentException("toString() kann für BinaeresGatter nicht aufgerufen werden");
    }
}
