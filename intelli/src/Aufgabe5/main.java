package Aufgabe5;

public class main {
    public static void main(String[] args) {
        Zug zug = new Zug();
        zug.anhaengen(new Wagen("Wagen1"));
        zug.anhaengen(new Wagen("Wagen2"));
        zug.anhaengen(new Wagen("Wagen3"));
        zug.anhaengen(new Wagen("Wagen4"));
    }
}
