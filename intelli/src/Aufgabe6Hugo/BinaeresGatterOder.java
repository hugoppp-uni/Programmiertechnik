package Aufgabe6Hugo;

public class BinaeresGatterOder extends BinaeresGatter{

  @Override
  public boolean getOutput() {
    return gatter[1].getOutput() && gatter[2].getOutput();
  }

  @Override
  public String toString() {
    return "noch nicht fertig";
  }
}
