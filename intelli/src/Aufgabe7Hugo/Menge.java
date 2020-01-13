package Aufgabe7Hugo;

// Immer Array um 1 verlängern
// Code-Konventionen: Kommentare zu Klassen und Objektvariablen
// Verineingung reparieren
// Zusatzaufgabe

/**
 * Verwaltet Elemente vom Typ Object, jedes Element ist ein Unikat
 */
public class Menge {
  /**
   * Objekte vom Typ Menge verwalten ihre Elemente in einem Array
   */
  private Object[] menge = new Object[0];

  public int getAnzElemente() {
    return menge.length;
  }

  /**
   * Wie einfuegen(), jedoch wird das Array immer um genau einen Platz vergrößert.
   *
   * @param objekt Das einzufüegende Objekt
   */
  public void einfuegen(Object objekt) {
    if (objekt == null) {
      throw new IllegalArgumentException("einfuegen(): Kann 'null' nicht einfügen");
    }
    if (menge.length != 0) {
      if (this.beinhaltet(objekt)) {
        return;
      }
    }
    arrayMengeUmEinsVerlaengern();
    menge[menge.length - 1] = objekt;
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
    if (andereMenge == null) {
      throw new IllegalArgumentException("Kann nicht mit 'null' schneiden");
    }
    for (Object elementAndererMenge : andereMenge.menge) {
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
    if (andereMenge == null) {
      throw new IllegalArgumentException("Eingabe darf nicht null sein");
    }
    Menge vereinigung = new Menge();
    for (Object element : menge) {
      vereinigung.einfuegen(element);
    }
    for (Object element : andereMenge.menge) {
      vereinigung.einfuegen(element);
    }
    return vereinigung;
  }

  /**
   * Bildet die Differenz zweier Mengen
   *
   * @param andereMenge Menge, die abgezogen werden soll
   * @return neue Menge, die die Differenz der zwei Mengen darstellt
   */
  public Menge abziehen(Menge andereMenge) {
    if (andereMenge == null) {
      throw new IllegalArgumentException("Eingabe darf nicht null sein");
    }
    Menge differenz = new Menge();
    for (Object element : menge) {
      if (!(andereMenge.beinhaltet(element))) {
        differenz.einfuegen(element);
      }
    }
    return differenz;
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
      sb.append(element.toString()).append("\n");
    }
    return sb.toString();
  }

  //Hilfsmethoden//

  /**
   * Verdoppelt die Größe des Arrays menge
   */
  private void arrayMengeVerdoppeln() {
    Object[] neuesArray = new Object[menge.length * 2];
    System.arraycopy(menge, 0, neuesArray, 0, menge.length);
    menge = neuesArray;
  }

  /**
   * Erhöht die Größe des Arrays menge um einen Platz
   */
  private void arrayMengeUmEinsVerlaengern() {
    Object[] neuesArray = new Object[menge.length + 1];
    System.arraycopy(menge, 0, neuesArray, 0, menge.length);
    menge = neuesArray;
  }
}
