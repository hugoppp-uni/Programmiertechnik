package Aufgabe7Justin;

/**
 * Aufzählung von existierenden Tolkien-Rassen
 */
public enum Rasse{
  MENSCH("Mensch"),
  ELB("Elb"),
  ZWERG("Zwerg"),
  HOBBIT("Hobbit");

  private String rasse;

  private Rasse(String rasse){
    this.rasse = rasse;
  }

  /**
   * Wandelt ein Aufzählungstyp Rasse in einen String um
   *
   * @return die Rasse in leserlicher Schreibweise
   */
  @Override
  public String toString(){
    return rasse;
  }
}



