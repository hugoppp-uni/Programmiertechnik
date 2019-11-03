package Aufgabe5;

public class Zug {
    Wagen referenz = null;

    void anhaengen(Wagen neuerWagen) {
        if (referenz == null) {
            this.referenz = neuerWagen;
        } else {
            referenz.referenz = neuerWagen;
        }
    }
}
