package Aufgabe6Justin;

/**
 *
 */
public class GatterNicht implements Gatter {
    private Gatter eingang;

    /**
     *
     * @param eingang
     */
    public GatterNicht(Gatter eingang) {
        this.eingang = eingang;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getOutput() {
        return !eingang.getOutput();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(NICHT " + eingang.toString();
    }

}
