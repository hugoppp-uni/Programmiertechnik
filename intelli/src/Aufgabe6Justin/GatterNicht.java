package Aufgabe6Justin;

/**
 * Gatter zur Negation eines Eingangswertes
 */
public class GatterNicht implements Gatter {
  private Gatter eingang;

  public GatterNicht(Gatter eingang) {
    if (eingang == null) {
      throw new IllegalArgumentException("Eingang darf nicht null sein");
    }
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
    return "(NICHT " + eingang.toString() + " )";
  }

}
