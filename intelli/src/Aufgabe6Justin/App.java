package Aufgabe6Justin;

public class App {
  public static void main(String[] args) {
    Eingang inputTrue = new Eingang(true, false);
    Eingang inputFalse = new Eingang(false, false);

    Gatter gatterUnd = new BinaeresGatterUnd(inputFalse, inputTrue);
    Gatter gatterOder = new BinaeresGatterOder(gatterUnd, inputTrue);
    Gatter gatterNicht = new GatterNicht(gatterOder);

    System.out.println(gatterNicht.toString());
  }
}
