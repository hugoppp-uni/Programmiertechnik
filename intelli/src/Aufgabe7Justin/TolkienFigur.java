package Aufgabe7Justin;

public class TolkienFigur{
  private final String NAME;
  private final Rasse RASSE;

  public TolkienFigur(String name, Rasse rasse){
    this.NAME = name;
    this.RASSE = rasse;
  }

  @Override
  public String toString(){
    return "";
  }

  @Override
  public int hashCode(){
    return 0;
  }

  @Override
  public boolean equals(Object object){
    return true;
  }

}
