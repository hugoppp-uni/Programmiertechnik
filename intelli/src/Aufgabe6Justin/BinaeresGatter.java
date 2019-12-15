package Aufgabe6Justin;

public class BinaeresGatter implements Gatter {
    protected Gatter[] eingaenge = new Gatter[2];

    public BinaeresGatter(Gatter eingang1, Gatter eingang2) {
        eingaenge[0] = eingang1;
        eingaenge[1] = eingang2;
    }

    @Override
    public boolean getOutput() {
        throw new IllegalArgumentException("getOutput() von BinaeresGatter kann nicht direkt aufgerufen werden");
    }

    @Override
    public String toString() {
        throw new IllegalArgumentException("toString() von BinaeresGatter kann nicht direkt aufgerufen werden");
    }
}
