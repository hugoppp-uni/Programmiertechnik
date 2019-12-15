package Aufgabe6Justin;

/**
 *
 */
public class Eingang implements Gatter {
    private boolean wert;

    /**
     *
     * @param wert
     */
    public Eingang(boolean wert) {
        this.wert = wert;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getOutput() {
        return wert;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return wert ? " WAHR " : " FALSCH ";
    }
}
