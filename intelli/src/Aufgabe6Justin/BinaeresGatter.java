package Aufgabe6Justin;

/**
 * Elternklasse für Gatter mit genau zwei Eingaengen
 */
public abstract class BinaeresGatter implements Gatter {
  /**
   * Eingaenge von Gattern mit genau zwei Eingaengen
   */
  protected Gatter[] eingaenge;

  public BinaeresGatter(Gatter eingang1, Gatter eingang2) {
    if (eingang1 == null || eingang2 == null) {
      throw new IllegalArgumentException("Eingang darf nicht null sein");
    }
    eingaenge = new Gatter[2];
    eingaenge[0] = eingang1;
    eingaenge[1] = eingang2;
  }

  public abstract boolean getOutput();

  public abstract String toString();
}
