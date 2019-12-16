package Aufgabe6Justin;

/**
 * @author Hugo
 * @author Justin
 * @version 1.0 / 16.12.2019, abgenommen
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
