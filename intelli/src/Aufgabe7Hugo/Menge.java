package Aufgabe7Hugo;

public class Menge {
  Object[] menge = new Object[10];
  int anzMenge = 0;

  /**
   * Fügt das objekt in de Menge ein, falls das Objekt bereits vorhanden ist -> IllegalArgumentException
   * @param objekt Das einzufügende Objekt
   */
  public void einfuegen(Object objekt) {
    if (beinhaltet(objekt)) {
      throw new IllegalArgumentException("einfuegen(): Objekt bereits in Menge vorhanden.");
    }
    if (anzMenge == menge.length){
      arrayVerdoppeln();
    }
    menge[anzMenge] = objekt;
  }

  /**
   * Überladene Version von einfuegen, fügt beliebig viele Objekte in die Menge ein
   * @param objekte einzügende Objekte
   */
  public void einfuegen(Object ... objekte){
    for (Object objekt : objekte){
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
