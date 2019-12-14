package Aufgabe6Hugo;

public abstract class BinaeresGatter implements Gatter {
  protected Gatter[] gatter = new Gatter[2];

  @Override
  public boolean getOutput() {
    throw new IllegalArgumentException("BinaeresGatter: getOutput() darf nicht direkt aufgerufen werden");
  }

}