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
    if (objekt == null) {
      throw new IllegalArgumentException("einfuegen(): Kann 'null' nicht einfügen");
    }
    if (this.beinhaltet(objekt)) {
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
   * @param andersObjekt Das zu prüfende Element
   * @return "true" falls vorhanden, "false" falls nicht vorhanden
   */
  public boolean beinhaltet(Object andersObjekt) {
    for (Object diesesObjekt : menge) {
      if (diesesObjekt == null) {
        return false;
      }
      if (diesesObjekt.hashCode() == andersObjekt.hashCode()) {
        if (diesesObjekt.equals(andersObjekt)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Bildet den Schnitt zweier Mengen
   *
   * @param andereMenge Menge, mit der der Schnitt gebildet wird
   * @return Schnitt beider Mengen
   */
  public Menge schnitt(Menge andereMenge) {
    Menge schnitt = new Menge();
    for (Object elementAndererMenge : andereMenge.menge) {
      if (elementAndererMenge == null) {
        break;
      }
      if (this.beinhaltet(elementAndererMenge)) {
        schnitt.einfuegen(elementAndererMenge);
      }
    }
    return schnitt;
  }

  /**
   * Bildet die Vereinigung zweier Mengen
   *
   * @param andereMenge Menge, mit der die Vereinigung gebildet werden soll
   * @return Vereinigte Menge
   */
  public Menge vereinigung(Menge andereMenge) {
    Menge vereinigung = this;
    for (Object element : andereMenge.menge) {
      if (element == null) {
        break;
      }
      try {
        vereinigung.einfuegen(element);
      } catch (IllegalArgumentException ignored) {
      }
    }
    return vereinigung;
  }

  /**
   * gibt alle Elemente der Menge als String aus
   *
   * @return Selbstbeschreibung der Menge
   */
  @Override
  public String toString() {
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
