package Aufgabe6Justin;

/**
 * Elternklasse für Gatter mit genau zwei Eingaengen
 */
public abstract class BinaeresGatter implements Gatter {
  /**
   * Eingaenge von Gattern mit genau zwei Eingaengen
   */
  protected Gatter[] eingaenge = new Gatter[2];

  public BinaeresGatter(Gatter eingang1, Gatter eingang2) {
    eingaenge[0] = eingang1;
    eingaenge[1] = eingang2;
  }

  /**
   * Getter für den Wert am Gatterausgang
   *
   * @throws IllegalArgumentException wenn getOutput() von BinaeresGatter aufgerufen wird
   */
  @Override
  public boolean getOutput() {
    throw new IllegalArgumentException("getOutput() kann für BinaeresGatter nicht aufgerufen werden");
  }

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @throws IllegalArgumentException wenn toString() von BinaeresGatter aufgerufen wird
   */
  @Override
  public String toString() {
    throw new IllegalArgumentException("toString() kann für BinaeresGatter nicht aufgerufen werden");
  }
}
