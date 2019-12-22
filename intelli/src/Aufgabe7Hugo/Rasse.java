package Aufgabe7Hugo;

public enum Rasse {
  MENSCH("Mensch"),
  ELB("Elb"),
  ZWERG("Zweg"),
  HOBBIT("Hobbit");

  private String rasse;

  private Rasse(String rasse) {
    this.rasse = rasse;
  }

  @Override
  public String toString() {
    return rasse;
  }
}