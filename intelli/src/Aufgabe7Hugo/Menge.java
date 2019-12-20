package Aufgabe7Hugo;

public class Menge {
  Object[] menge = new Object[10];
  int anzMenge = 0;

  /**
   * Fügt das objekt in de Menge ein, falls das Objekt bereits vorhanden ist -> IllegalArgumentException
   *
   * @param objekt Das einzufügende Objekt
   */
  public void einfuegen(Object objekt) {
    if (beinhaltet(objekt)) {
      throw new IllegalArgumentException("einfuegen(): Objekt bereits in Menge vorhanden.");
    }
    if (anzMenge == menge.length) {
      arrayVerdoppeln();
    }
    menge[anzMenge] = objekt;
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
   * @param menge1 erste Menge
   * @return Schnitt beider Mengen
   */
  public Menge schnitt(Menge menge1) {
    Menge schnitt = new Menge();
    for (Object element1 : menge1.menge) {
      for (Object element2 : this.menge) {
        if (element1 == element2) {
          schnitt.einfuegen(element1);
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
    StringBuilder sb = new StringBuilder();
    for (Object element : menge) {
      sb.append(element.toString()).append(" ");
    }
    return sb.toString();
  }


  //Hilfsmethoden//

  /**
   * Verdoppelt die größe des Arrays menge
   */
  private void arrayVerdoppeln() {
    Object[] neuesArray = new Object[menge.length * 2];
    System.arraycopy(menge, 0, neuesArray, 0, menge.length);
    menge = neuesArray;
  }
}
