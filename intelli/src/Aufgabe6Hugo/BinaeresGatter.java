package Aufgabe6Hugo;

public abstract class BinaeresGatter implements Gatter {
  protected Gatter[] gatter = new Gatter[2];

  public BinaeresGatter(Eingang wert1, Eingang wert2) {
    gatter[0] = wert1;
    gatter[1] = wert2;
  }

  @Override
  public boolean getOutput() {
    throw new IllegalArgumentException("BinaeresGatter: getOutput() darf nicht direkt aufgerufen werden");
  }

}