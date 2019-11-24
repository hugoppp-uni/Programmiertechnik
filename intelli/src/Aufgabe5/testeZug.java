package Aufgabe5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeZug{
    @Test
    public void testeHinzufügen(){
        Zug zug = new Zug();
        Wagen wagen1 = new Wagen("wagen1");
        Wagen wagen2 = new Wagen("wagen2");
        Wagen wagen3 = new Wagen("wagen3");
        zug.anhaengen(wagen1);
        zug.anhaengen(wagen2);
        zug.anhaengen(wagen3);
        //testet, ob ersterWagen im Zugobjekt richtig gesetzt wird
        assertEquals(zug.getErsterWagen(),wagen1);
        //testet, ob naechsterWagen vom ersten Wagen richtig gesetzt ist.
        assertEquals(wagen1.naechsterWagen, wagen2);
        //testet, ob naeshterWagen vom zweiten Wagen richtig gesetzt ist.
        assertEquals(wagen2.naechsterWagen, wagen3);
        //testet, ob am letzen Wagen kein weiterer Wagen hängt
        assertNull(wagen3.naechsterWagen);
    }
}
