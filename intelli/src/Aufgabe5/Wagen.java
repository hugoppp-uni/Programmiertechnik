package Aufgabe5;

public class Wagen {
    /**
     * Referenz auf den nächsten Wagen.
     * Wenn 'naechsterWagen = null' ist kein Wagen angehängt
     */

    Wagen naechsterWagen = null;
    private String id;

    Wagen(String id) {
        this.id = id;
    }
}