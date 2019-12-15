package Aufgabe6Justin;

/**
 *
 */
public class BinaeresGatterOder extends BinaeresGatter{
    public BinaeresGatterOder(Gatter eingang1, Gatter eingang2) {
        super(eingang1, eingang2);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getOutput() {
        return eingaenge[0].getOutput() || eingaenge[1].getOutput();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + eingaenge[0].toString() + "ODER" + eingaenge[1].toString() + ")";
    }
}
