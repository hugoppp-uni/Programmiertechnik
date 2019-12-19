package Aufgabe7Justin;

/**
 * Aufzählung von existierenden Tolkien-Rassen
 */
public enum Rasse{
  MENSCH("Mensch"),
  ELB("Elb"),
  ZWERG("Zwerg"),
  HOBBIT("Hobbit");

  /**
   * Jede Konstante von Rasse wird durch eine Objektvariable vom Typ String repraesentiert
   */
  private String rasse;

  private Rasse(String rasse){
    this.rasse = rasse;
  }

  /**
   * Wandelt einen Aufzählungstyp Rasse in einen String um
   *
   * @return die Rasse in leserlicher Schreibweise
   */
  @Override
  public String toString(){
    return rasse;
  }
}



