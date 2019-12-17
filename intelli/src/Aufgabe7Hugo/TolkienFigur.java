package Aufgabe7Hugo;

public class TolkienFigur {
  private final String name;
  private final Rasse rasse;

  public TolkienFigur(String name, Rasse rasse) {
    this.name = name;
    this.rasse = rasse;
  }

  enum Rasse {
    MENSCH, ELB, ZWERG, HOBBIT;

    @Override
    public String toString() {
      return this == MENSCH ? "Mensch" :
        this == ELB ? "Elb" :
          this == ZWERG ? "Zwerg" :
            this == HOBBIT ? "Hobbit" : "Fehler";
    }
  }

  @Override
  public String toString() {
    return this.name + " ist ein " + this.rasse.toString();
  }
}
