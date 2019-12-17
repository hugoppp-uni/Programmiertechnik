package Aufgabe7Justin;

public class Menge{
  protected Object[] menge;

  public Menge(Object[] menge){
    this.menge = menge;
  }

  /**
   * @param object
   */
  public void einfuegen(Object object){

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

  /**
   * @return
   */
  @Override
  public String toString(){
    return "";
  }
}
