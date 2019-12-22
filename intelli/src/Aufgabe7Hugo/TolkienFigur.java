package Aufgabe7Hugo;

public class TolkienFigur {
  private final String name;
  private final Rasse rasse;

  public TolkienFigur(String name, Rasse rasse) {
    this.name = name;
    this.rasse = rasse;
  }

  /**
   * Beschreibung der Figur durch Name und Rasse
   *
   * @return Beschreibung der Figur
   */
  @Override
  public String toString() {
    return String.format("Tolkien Figur: %s (Rasse: %s)", this.name, rasse.toString());
  }

  /**
   * Equals Methode
   *
   * @param object zu vergleichendes Objekt
   * @return true wenn Name und Rasse übereinstimmen
   */
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TolkienFigur)) {
      return false;
    }
    TolkienFigur andereFigur = (TolkienFigur) object;
    return this.name == andereFigur.name && this.rasse == andereFigur.rasse;
  }

  /**
   * hashcode Methode
   *
   * @return
   */
  @Override
  public int hashCode() {
    return this.name.hashCode() + this.rasse.hashCode();
  }
}