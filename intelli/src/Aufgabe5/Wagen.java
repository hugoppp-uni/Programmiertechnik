package Aufgabe5;

public class Wagen {
    /**
     * Referenz auf den nächsten Wagen.
     * Wenn 'naechsterWagen = null' ist kein Wagen angehängt
     */
    public Wagen naechsterWagen = null;
    /**
     * die ID des Wagens
     */
    private String id;

    Wagen(String id) {
        this.id = id.toLowerCase();
    }

    public String getId() {
        return id;
    }
}