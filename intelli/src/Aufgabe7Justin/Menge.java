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
   * Fügt ein beliebieges Objekt in die Menge ein
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
   * @return
   */
  public boolean beinhaltet(Object object){
    return true;
  }

  /**
   * @param menge
   * @return
   */
  public Menge schneiden(Menge menge){
    return menge;
  }

  /**
   * @param menge
   * @return
   */
  public Menge vereinigen(Menge menge){
    return menge;
  }

}
