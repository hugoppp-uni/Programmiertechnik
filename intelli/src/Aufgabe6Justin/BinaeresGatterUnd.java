package Aufgabe6Justin;

public class BinaeresGatterUnd extends BinaeresGatter {

    public BinaeresGatterUnd(Gatter eingang1, Gatter eingang2) {
        super(eingang1, eingang2);
    }

    @Override
    public boolean getOutput() {
        return eingaenge[0].getOutput() && eingaenge[1].getOutput();
    }

    @Override
    public String toString() {
        return eingaenge[0].getOutput() + "UND" + eingaenge[1].getOutput();
    }
}
