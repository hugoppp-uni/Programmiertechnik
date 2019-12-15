package Aufgabe6Justin;

public class App {
    public static void main(String[] args) {
        Eingang wahr = new Eingang(true);
        Eingang falsch = new Eingang(false);

        Gatter gatterUnd = new BinaeresGatterUnd(falsch, wahr);
        Gatter gatterOder = new BinaeresGatterOder(gatterUnd, wahr);
        Gatter gatterNicht = new GatterNicht(gatterOder);

        System.out.println(gatterNicht.toString());
    }
}
