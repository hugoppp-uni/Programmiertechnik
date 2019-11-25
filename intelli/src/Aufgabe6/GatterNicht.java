package Aufgabe6;

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
}
