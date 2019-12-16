package Aufgabe6Justin;

/**
 * Gatter für unveränderten Wert des Eingangswertes
 */
public class Eingang implements Gatter {
  /**
   * EingangsWert des Gatters
   */
  private boolean wert;

  private final static boolean WACKELKONTAKT = true;

  public Eingang(boolean wert) {
    this.wert = wert;
  }

  /**
   * Getter für den Wert am Gatterausgang
   *
   * @return Ausgangswert des Gatters
   */
  @Override
  public boolean getOutput() {
    if (WACKELKONTAKT) {
      double zz = Math.random();
      if (zz < 1.0 / 3.0) {
        return zz < 1.0 / 6.0;
      }
    }
      return wert;
  }

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @return Beschreibung des Gatters
   */
  @Override
  public String toString() {
    return wert ? " WAHR " : " FALSCH ";
  }
}
