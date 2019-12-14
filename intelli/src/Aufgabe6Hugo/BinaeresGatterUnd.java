package Aufgabe6Hugo;

public class BinaeresGatterUnd extends BinaeresGatter {

  public BinaeresGatterUnd(Eingang wert1, Eingang wert2) {
    super(wert1, wert2);
  }

  @Override
  public boolean getOutput() {
    return gatter[0].getOutput() && gatter[1].getOutput();
  }

  @Override
  public String toString() {
    return gatter[0].getOutput() + " UND " + gatter[1].getOutput();
  }
}
