package Aufgabe6Justin;

/**
 * Gatter für eine logische UND-Verknuepfung von genau zwei Eingangswerten
 */
public class BinaeresGatterUnd extends BinaeresGatter {
  public BinaeresGatterUnd(Gatter eingang1, Gatter eingang2) {
    super(eingang1, eingang2);
  }

  /**
   * Getter für den Wert am Gatterausgang
   *
   * @return Ergebnis der logischen UND-Verknuepfung der beiden Eingangswerte
   */
  @Override
  public boolean getOutput() {
    return eingaenge[0].getOutput() && eingaenge[1].getOutput();
  }

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @return Beschreibung des Gatters
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("(").append(eingaenge[0].toString());
    sb.append("UND");
    sb.append(eingaenge[1].toString());
    sb.append(")");
    return sb.toString();
  }
}
