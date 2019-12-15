package Aufgabe6Justin;

/**
 * Gatter als Interface
 */
public interface Gatter {
  /**
   * Getter für den Wert am Gatterausgang
   *
   * @return Ausgangswert des Gatters
   */
  public boolean getOutput();

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @return Beschreibung des Gatters
   */
  public String toString();
}
