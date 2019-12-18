package Aufgabe7Justin;

public class Menge{
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
   * @param object
   */
  public void einfuegen(Object object){
    if(object == null){
      throw new IllegalArgumentException("Eingabe kann nicht null sein");
    }

    if(menge[menge.length - 1] != null){
      Object[] copy = new Object[menge.length + 1];
      System.arraycopy(menge, 0, copy, 0, menge.length);
      menge = copy;
    }
    for(int i = 0; i < menge.length; i++){
      if(menge[i] == null){
        //reduziert die länge des Arrays auf Anzahl der tatsächlichen Objekte in der Menge
        //deswegen arraycopy, sonst NullPointerException beim Aufruf von toString() von Menge
        Object[] copy = new Object[i + 1];
        System.arraycopy(menge, 0, copy, 0, i + 1);
        menge = copy;
        menge[i] = object;
      }
    }


  }

  /**
   * @param object
   */
  public void einfuegen(Object... object){

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
