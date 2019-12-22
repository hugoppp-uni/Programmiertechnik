package Aufgabe7Hugo;

public class Menge {
  private Object[] menge = new Object[10];
  private int anzElemente = 0;

  public int getAnzElemente() {
    return anzElemente;
  }

  /**
   * Fügt das objekt in die Menge ein, falls das Objekt bereits vorhanden ist -> IllegalArgumentException
   *
   * @param objekt Das einzufügende Objekt
   */
  public void einfuegen(Object objekt) {
    if (objekt == null){
      throw  new IllegalArgumentException("einfuegen(): Kann 'null' nicht einfügen");
    }
    if (beinhaltet(objekt)) {
      throw new IllegalArgumentException("einfuegen(): Objekt bereits in Menge vorhanden.");
    }
    if (anzElemente == menge.length) {
      arrayVerdoppeln();
    }
    menge[anzElemente] = objekt;
    anzElemente++;
  }

  /**
   * Überladene Version von einfuegen, fügt beliebig viele Objekte in die Menge ein
   *
   * @param objekte einzügende Objekte
   */
  public void einfuegen(Object... objekte) {
    for (Object objekt : objekte) {
      einfuegen(objekt);
    }
  }

  /**
   * Prüft ob das Objekt bereits in der Menge enthalten ist
   *
   * @param objekt Das zu prüfende Element
   * @return "true" falls vorhanden, "false" falls nicht vorhanden
   */
  public boolean beinhaltet(Object objekt) {
    for (int i = 0; i < menge.length; i++) {
      if (menge[i] == objekt) {
        return true;
      }
    }
    return false;
  }

  /**
   * Bildet den Schnitt zweier Mengen
   * @param andereMenge Menge, mit der der Schnitt gebildet wird
   * @return Schnitt beider Mengen
   */
  public Menge schnitt(Menge andereMenge) {
    Menge schnitt = new Menge();
    for (Object element1 : andereMenge.menge) {
      if (element1 == null) {
        break;
      }
      for (Object element2 : this.menge) {
        if (element2 == null) {
          break;
        }
        if (element1.equals(element2)) {
          schnitt.einfuegen(element1);
          //element1 == element2, daher muss man diese nicht weiter vergleichen
          break;
        }
      }
    }
    return schnitt;
  }

  /**
   * Bildet die Vereinigung zweier Mengen
   * @param andereMenge erste Menge
   * @return Vereinigte Menge
   */
  public Menge vereinigung(Menge andereMenge) {
    Menge vereinigung = new Menge();
    for (Object element1 : andereMenge.menge) {
      for (Object element2 : this.menge) {
        vereinigung.einfuegen(element1);
      }
    }
    return vereinigung;
  }

  /**
   * gibt alle Elemente der Menge als String aus
   * @return Selbstbeschreibung der Menge
   */
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder("----- Diese Menge enthält -----\n");
    for (Object element : menge) {
      if (element == null) {
        break;
      }
      sb.append(element.toString()).append("\n");
    }
    return sb.toString();
  }

  //Hilfsmethoden//

  /**
   * Verdoppelt die Größe des Arrays menge
   */
  private void arrayVerdoppeln() {
    Object[] neuesArray = new Object[menge.length * 2];
    System.arraycopy(menge, 0, neuesArray, 0, menge.length);
    menge = neuesArray;
  }
}
