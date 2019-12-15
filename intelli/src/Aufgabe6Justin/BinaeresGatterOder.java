package Aufgabe6Justin;

public class BinaeresGatterOder extends BinaeresGatter {

    public BinaeresGatterOder(Gatter eingang1, Gatter eingang2) {
        super(eingang1, eingang2);
    }

    @Override
    public boolean getOutput() {
        return eingaenge[0].getOutput() || eingaenge[1].getOutput();
    }

    @Override
    public String toString() {
        return eingaenge[0].getOutput() + "ODER" + eingaenge[1].getOutput();
    }
}
