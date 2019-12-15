package Aufgabe6Justin;

public class App {
    public static void main(String[] args) {
        Eingang inputFalse = new Eingang(false);
        Eingang inputTrue = new Eingang(true);
        Eingang inputTrue2 = new Eingang(true);

        Gatter gatterUnd = new BinaeresGatterUnd(inputFalse, inputTrue);
        Gatter gatterOder = new BinaeresGatterOder(gatterUnd, inputTrue2);
        Gatter gatterNicht = new GatterNicht(gatterOder);
    }
}
