package Aufgabe6Justin;

/**
 * Gatter für eine logische ODER-Verknuepfung von genau zwei Eingangswerten
 */
public class BinaeresGatterOder extends BinaeresGatter {
  public BinaeresGatterOder(Gatter eingang1, Gatter eingang2) {
    super(eingang1, eingang2);
  }

  /**
   * Getter für den Wert am Gatterausgang
   *
   * @return Ergebnis der logischen ODER-Verknuepfung der beiden Eingangswerte
   */
  @Override
  public boolean getOutput() {
    return eingaenge[0].getOutput() || eingaenge[1].getOutput();
  }

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @return Beschreibung des Gatters
   */
  @Override
  public String toString() {
    return "(" + eingaenge[0].toString() + " ODER " + eingaenge[1].toString() + ")";
  }
}
