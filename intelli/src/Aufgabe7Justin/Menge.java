package Aufgabe7Justin;

/**
 * Verwaltet Elemente vom Typ Object, jedes Element ist ein Unikat
 */
public class Menge{
  /**
   * Objekte vom Typ Menge verwalten ihre Elemente in einem Array
   */
  protected Object[] menge;

  public Menge(Object[] menge){
    this.menge = menge;
  }

  /**
   * Wandelt ein Objekt vom Typ Menge in einen String um
   *
   * @return jedes Objekt der Menge als String
   */
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < menge.length; i++){
      if(menge[0] == null){
        throw new IllegalArgumentException("Array ist leer");
      }
      sb.append(menge[i].toString()).append("\n");
    }
    return String.valueOf(sb);
  }

  /**
   * Entfernen der Null-Werte aus einem Array vom Typ Object
   *
   * @param object Array vom Typ Object
   * @return getrimmtes Array vom Typ Object
   */
  public Object[] trimArray(Object[] object){
    for(int i = 0; i < object.length; i++){
      if(object[i] == null){
        Object[] copy = new Object[i];
        System.arraycopy(object, 0, copy, 0, copy.length);
        object = copy;
      }
    }
    return object;
  }

  /**
   * Fügt ein beliebieges Objekt in die Menge ein
   * Duplikate werden ignoriert
   *
   * @param object das in die Menge einzufuegende Objekt vom Typ Object
   * @throws IllegalArgumentException bei Eingabe von null
   */
  public void einfuegen(Object object){
    if(object == null){
      throw new IllegalArgumentException("Eingabe kann nicht null sein");
    }
    // Erhoehen der Arraylaenge um 1, wenn Array voll ist
    if(menge[menge.length - 1] != null){
      Object[] copy = new Object[menge.length + 1];
      System.arraycopy(menge, 0, copy, 0, menge.length);
      menge = copy;
    }
    // Durchiterieren des Arrays
    for(int i = 0; i < menge.length; i++){
      // wenn das Objekt bereits im Array ist, wird die Vergroesserung des Arrays rueckgaengig gemacht
      // und somit das Einfuegen gestoppt
      if(menge[i] != null && menge[i].equals(object)){
        Object[] copy = new Object[menge.length - 1];
        System.arraycopy(menge, 0, copy, 0, menge.length - 1);
        menge = copy;
      }
      // bei null ist das Ende des Arrays, wo das neue Objekt eingefuegt wird
      if(menge[i] == null){
        // reduziert die Laenge des Arrays auf die Anzahl der tatsächlichen Objekte in der Menge,
        // um potentiellen Nullpointern vorzubeugen
        Object[] copy = new Object[i + 1];
        System.arraycopy(menge, 0, copy, 0, i + 1);
        menge = copy;
        menge[i] = object;
      }
    }
  }

  /**
   * Fügt eine beliebiege Anzahl an Objekten in die Menge ein
   * Duplikate werden ignoriert
   *
   * @param objects das in die Menge einzufuegende Objekt vom Typ Object
   * @throws IllegalArgumentException bei Eingabe von null
   */
  public void einfuegen(Object... objects){
    // einfuegen() wird per Iteration fuer jedes Objekt in der Eingabe durchgefuehrt
    for(int x = 0; x < objects.length; x++){
      einfuegen(objects[x]);
    }
  }

  /**
   * Prueft, ob ein Objekt in der Menge ist
   *
   * @return wahrheitswert
   */
  public boolean beinhaltet(Object object){
    boolean wahrheitswert = false;
    for(int i = 0; i < menge.length; i++){
      if(menge[i].equals(object)){
        wahrheitswert = true;
      }
    }
    return wahrheitswert;
  }

  /**
   * Erzeugt ein neues Objekte, welches die Vereinigungsmenge zweier Mengen darstellt
   * Duplikate werden ignoriert
   *
   * @param menge2 Menge mit der vereinigt werden soll
   * @return neues Objekt vom Typ Menge, welches die Vereinigungsmenge ist
   */
  public Menge vereinigen(Menge menge2){
    // Erstellen einer Kopie, die beide Mengen erstmal nur zusammenfügt
    Object[] copy = new Object[menge.length + menge2.menge.length];
    System.arraycopy(menge, 0, copy, 0, menge.length);
    System.arraycopy(menge2.menge, 0, copy, menge.length, menge2.menge.length);
    // Entfernen der Duplikate im Array
    for(int i = 0; i < copy.length; i++){
      for(int j = i + 1; j < copy.length; j++){
        if(copy[i] != null && copy[i].equals(copy[j])){
          Object[] copy2 = new Object[copy.length + 1];
          System.arraycopy(copy, 0, copy2, 0, copy.length);
          copy[j] = copy2[j + 1];
        }
      }
    }
    // Erzeugen eines neuen Objektes
    Menge vereinigung = new Menge(trimArray(copy));
    return vereinigung;
  }

  /**
   * Erzeugt ein neues Objekte, welches die Schnittmenge zweier Mengen darstellt
   *
   * @param menge2 Menge mit der geschnitten werden soll
   * @return neues Objekt vom Typ Menge, welches die Schnittmenge ist
   */
  public Menge schneiden(Menge menge2){
    // Erstellen einer Kopie, die beide Mengen erstmal nur zusammenfügt
    Object[] copy = new Object[menge.length + menge2.menge.length];
    System.arraycopy(menge, 0, copy, 0, menge.length);
    System.arraycopy(menge2.menge, 0, copy, menge.length, menge2.menge.length);
    // Schreiben der Array-Duplikate in eine Kopie
    Object[] copy2 = new Object[menge.length + menge2.menge.length];
    int index = 0;
    for(int i = 0; i < copy.length; i++){
      for(int j = i + 1; j < copy.length; j++){
        if(copy[i] != null && copy[i].equals(copy[j])){
          copy2[index] = copy[i];
          index++;
        }
      }
    }
    // Erzeugen eines neuen Objektes
    Menge schnitt = new Menge(trimArray(copy2));
    return schnitt;
  }
}
