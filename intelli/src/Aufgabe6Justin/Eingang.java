package Aufgabe6Justin;

/**
 * Gatter für unveränderten Wert des Eingangswertes
 */
public class Eingang implements Gatter {
  /**
   * EingangsWert des Gatters
   */
  private boolean wert;
  public static boolean WACKELKONTAKT;


  public Eingang(boolean wert, boolean wk) {
    this.wert = wert;
    this.WACKELKONTAKT = wk;
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
      //mit Warscheinlichkeit von 1/3
      if (zz < 1.0 / 3.0) {
        //mit Warscheinlichkeit von 1/2*1/3 wahr, bzw falsch
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
    return this.getOutput() ? " WAHR " : " FALSCH ";
  }
}
