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
     * Getter für den Wert am Gatterausgang
     *
     * @return Einganswert negiert
     */
    @Override
    public boolean getOutput() {
        return !eingang.getOutput();
    }

    /**
     * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
     *
     * @return Beschreibung des Gatters
     */
    @Override
    public String toString() {
        return "(NICHT " + eingang.toString();
    }

}
