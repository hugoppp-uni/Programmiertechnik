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
    StringBuilder sb = new StringBuilder(this.name);
    return sb.append(" (").append(rasse.toString()).append(")").toString();
  }
}
