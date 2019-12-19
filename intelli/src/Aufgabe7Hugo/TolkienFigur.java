package Aufgabe7Hugo;

public class TolkienFigur {
  private final String name;
  private final Rasse rasse;

  public TolkienFigur(String name, Rasse rasse) {
    this.name = name;
    this.rasse = rasse;
  }



  @Override
  public String toString() {
    return this.name + " ist ein " + this.rasse.toString();
  }
}
