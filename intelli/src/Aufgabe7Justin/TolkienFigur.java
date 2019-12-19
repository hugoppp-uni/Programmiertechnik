package Aufgabe7Justin;

public class TolkienFigur{
  private final String NAME;
  private final Rasse RASSE;

  public TolkienFigur(String name, Rasse rasse){
    this.NAME = name;
    this.RASSE = rasse;
  }

  public Rasse getRASSE(){
    return RASSE;
  }

  public String getNAME(){
    return NAME;
  }

  /**
   * Wandelt ein Objekt vom Typ TolkienFigur in einen String um
   *
   * @return Zusammengesetzter String mit Name und Rasse der Figur
   */
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    return String.valueOf(sb.append(this.NAME).append(", ").append(this.RASSE.toString()));
  }

  /**
   * Führt einen inhaltlichen Vergleich mit einem Objekt vom
   * Typ TolkienFigur und einem anderen Objekt durch
   *
   * @param object beliebiges Vergleichsobjekt
   * @return true oder false basierend auf der Gleichheit der Vergleichsobjekte
   */
  @Override
  public boolean equals(Object object){
      if(!(object instanceof TolkienFigur)){
        return false;
      }
      TolkienFigur andereFigur = (TolkienFigur)object;
      return (this.RASSE.equals(andereFigur.RASSE)) &&
        (this.NAME.equals(andereFigur.NAME));
  }
  @Override
  public int hashCode(){
    return 0;
  }
}


